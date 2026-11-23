
import java.util.Scanner;

public class GerenciadorReceitas {

    private Receita[] receitasEnviadas = new Receita[50];
    private int quantidade = 0;

    public void enviarReceita(Scanner teclado, Usuario usuario) {

        if (usuario == null) {
            System.out.println("Voce precisa fazer login para enviar uma receita!");
            return;
        }

        if (quantidade >= receitasEnviadas.length) {
            System.out.println("Limite de receitas enviadas atingido!");
            return;
        }

        System.out.println("\n===== ENVIAR RECEITA =====");

        System.out.print("Nome da receita: ");
        String nome = teclado.nextLine().trim();

        System.out.print("Regiao (Norte, Nordeste, Centro-Oeste, Sudeste ou Sul): ");
        String regiao = teclado.nextLine().trim();

        if (regiao.equalsIgnoreCase("Norte")) {
            regiao = "Norte";
        } else if (regiao.equalsIgnoreCase("Nordeste")) {
            regiao = "Nordeste";
        } else if (regiao.equalsIgnoreCase("Centro-Oeste")) {
            regiao = "Centro-Oeste";
        } else if (regiao.equalsIgnoreCase("Sudeste")) {
            regiao = "Sudeste";
        } else if (regiao.equalsIgnoreCase("Sul")) {
            regiao = "Sul";
        } else {
            System.out.println("Regiao invalida! Receita nao enviada.");
            return;
        }

        System.out.print("Categoria: ");
        String categoria = teclado.nextLine().trim();

        System.out.print("Origem da receita: ");
        String origem = teclado.nextLine().trim();

        System.out.print("Dificuldade: ");
        String dificuldade = teclado.nextLine().trim();

        System.out.print("Tempo de preparo: ");
        String tempo = teclado.nextLine().trim();

        System.out.print("Ingredientes: ");
        String ingredientes = teclado.nextLine().trim();

        System.out.print("Modo de preparo: ");
        String modoPreparo = teclado.nextLine().trim();

        System.out.print("Curiosidade (opcional): ");
        String curiosidade = teclado.nextLine().trim();

        if (nome.equals("") || categoria.equals("") || origem.equals("")
                || dificuldade.equals("") || tempo.equals("")
                || ingredientes.equals("") || modoPreparo.equals("")) {

            System.out.println("Preencha todos os campos obrigatorios!");
            return;
        }

        Receita receita = new Receita(
                nome,
                new Regiao(regiao),
                new Categoria(categoria),
                origem,
                dificuldade,
                tempo,
                ingredientes,
                modoPreparo,
                curiosidade,
                usuario.getNome(),
                "Pendente"
        );

        receitasEnviadas[quantidade] = receita;
        quantidade++;

        System.out.println("\nReceita enviada com sucesso!");
        System.out.println("Ela ficara aguardando a aprovacao do administrador.");
    }

    public void mostrarPendentes() {

        System.out.println("\n===== RECEITAS PENDENTES =====");

        int pendentes = 0;

        for (int i = 0; i < quantidade; i++) {

            if (receitasEnviadas[i].getStatus().equals("Pendente")) {

                System.out.println("Receita: " + receitasEnviadas[i].getNome());
                System.out.println("Autor: " + receitasEnviadas[i].getAutor());
                System.out.println("----------------------------");

                pendentes++;
            }
        }

        if (pendentes == 0) {
            System.out.println("Nao existem receitas pendentes.");
        }
    }

    public void analisarReceitas(Scanner teclado) {

        mostrarPendentes();

        System.out.print("\nDigite 0 para voltar ou o numero da receita: ");
        int opcao = teclado.nextInt();
        teclado.nextLine();

        if (opcao == 0) {
            return;
        }

        int contador = 0;
        int indice = -1;

        for (int i = 0; i < quantidade; i++) {

            if (receitasEnviadas[i].getStatus().equals("Pendente")) {

                contador++;

                if (contador == opcao) {
                    indice = i;
                }
            }
        }

        if (indice == -1) {
            System.out.println("Receita invalida!");
            return;
        }

        receitasEnviadas[indice].mostrarReceita();

        System.out.println("\n1 - Aprovar receita");
        System.out.println("2 - Rejeitar receita");
        System.out.println("0 - Voltar");
        System.out.print("Escolha uma opcao: ");

        int escolha = teclado.nextInt();
        teclado.nextLine();

        if (escolha == 1) {
            receitasEnviadas[indice].setStatus("Aprovada");
            System.out.println("Receita aprovada com sucesso!");

        } else if (escolha == 2) {
            receitasEnviadas[indice].setStatus("Rejeitada");
            System.out.println("Receita rejeitada!");

        } else if (escolha == 0) {
            System.out.println("Voltando ao painel...");

        } else {
            System.out.println("Opcao invalida!");
        }
    }

    public void mostrarAprovadas() {

        System.out.println("\n===== RECEITAS APROVADAS =====");

        int aprovadas = 0;

        for (int i = 0; i < quantidade; i++) {

            if (receitasEnviadas[i].getStatus().equals("Aprovada")) {

                System.out.println((aprovadas + 1) + " - " + receitasEnviadas[i].getNome());
                aprovadas++;
            }
        }

        if (aprovadas == 0) {
            System.out.println("Nao existem receitas aprovadas enviadas por usuarios.");
        }
    }

    public void editarReceita(Scanner teclado) {

        mostrarAprovadas();

        System.out.print("\nDigite 0 para voltar ou o numero da receita: ");
        int opcao = teclado.nextInt();
        teclado.nextLine();

        if (opcao == 0) {
            return;
        }

        int contador = 0;
        int indice = -1;

        for (int i = 0; i < quantidade; i++) {

            if (receitasEnviadas[i].getStatus().equals("Aprovada")) {

                contador++;

                if (contador == opcao) {
                    indice = i;
                }
            }
        }

        if (indice == -1) {
            System.out.println("Receita invalida!");
            return;
        }

        Receita receita = receitasEnviadas[indice];

        System.out.println("\n===== EDITAR RECEITA =====");
        receita.mostrarReceita();

        System.out.print("\nNovo nome: ");
        String nome = teclado.nextLine().trim();

        System.out.print("Nova regiao: ");
        String regiao = teclado.nextLine().trim();

        if (regiao.equalsIgnoreCase("Norte")) {
            regiao = "Norte";
        } else if (regiao.equalsIgnoreCase("Nordeste")) {
            regiao = "Nordeste";
        } else if (regiao.equalsIgnoreCase("Centro-Oeste")) {
            regiao = "Centro-Oeste";
        } else if (regiao.equalsIgnoreCase("Sudeste")) {
            regiao = "Sudeste";
        } else if (regiao.equalsIgnoreCase("Sul")) {
            regiao = "Sul";
        } else {
            System.out.println("Regiao invalida! Edicao cancelada.");
            return;
        }

        System.out.print("Nova categoria: ");
        String categoria = teclado.nextLine().trim();

        System.out.print("Nova origem: ");
        String origem = teclado.nextLine().trim();

        System.out.print("Nova dificuldade: ");
        String dificuldade = teclado.nextLine().trim();

        System.out.print("Novo tempo de preparo: ");
        String tempo = teclado.nextLine().trim();

        System.out.print("Novos ingredientes: ");
        String ingredientes = teclado.nextLine().trim();

        System.out.print("Novo modo de preparo: ");
        String modoPreparo = teclado.nextLine().trim();

        System.out.print("Nova curiosidade: ");
        String curiosidade = teclado.nextLine().trim();

        if (nome.equals("") || categoria.equals("") || origem.equals("")
                || dificuldade.equals("") || tempo.equals("")
                || ingredientes.equals("") || modoPreparo.equals("")) {

            System.out.println("Preencha todos os campos obrigatorios! Edicao cancelada.");
            return;
        }

        receita.setNome(nome);
        receita.setRegiao(new Regiao(regiao));
        receita.setCategoria(new Categoria(categoria));
        receita.setOrigem(origem);
        receita.setDificuldade(dificuldade);
        receita.setTempo(tempo);
        receita.setIngredientes(ingredientes);
        receita.setModoPreparo(modoPreparo);
        receita.setCuriosidade(curiosidade);

        System.out.println("\nReceita atualizada com sucesso!");
    }

    public void excluirReceita(Scanner teclado) {

        mostrarAprovadas();

        System.out.print("\nDigite 0 para voltar ou o numero da receita: ");
        int opcao = teclado.nextInt();
        teclado.nextLine();

        if (opcao == 0) {
            return;
        }

        int contador = 0;
        int indice = -1;

        for (int i = 0; i < quantidade; i++) {

            if (receitasEnviadas[i].getStatus().equals("Aprovada")) {

                contador++;

                if (contador == opcao) {
                    indice = i;
                }
            }
        }

        if (indice == -1) {
            System.out.println("Receita invalida!");
            return;
        }

        for (int i = indice; i < quantidade - 1; i++) {
            receitasEnviadas[i] = receitasEnviadas[i + 1];
        }

        receitasEnviadas[quantidade - 1] = null;
        quantidade--;

        System.out.println("Receita excluida com sucesso!");
    }

    public Receita[] getReceitasAprovadas() {

        int totalAprovadas = 0;

        for (int i = 0; i < quantidade; i++) {

            if (receitasEnviadas[i].getStatus().equals("Aprovada")) {
                totalAprovadas++;
            }
        }

        Receita[] receitasAprovadas = new Receita[totalAprovadas];

        int posicao = 0;

        for (int i = 0; i < quantidade; i++) {

            if (receitasEnviadas[i].getStatus().equals("Aprovada")) {

                receitasAprovadas[posicao] = receitasEnviadas[i];
                posicao++;
            }
        }

        return receitasAprovadas;
    }
}
