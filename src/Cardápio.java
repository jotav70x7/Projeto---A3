
import java.util.ArrayList;
import java.util.Scanner;

public class Cardápio {

    public void exibirMenu(Scanner teclado, ArrayList<Receita> receitas,
                           RepositorioReceitas repositorio) {

        int opcao;

        do {
            System.out.println("\n===== DEVBRODERS - LIVRO DE RECEITAS =====");
            System.out.println("1 - Norte");
            System.out.println("2 - Nordeste");
            System.out.println("3 - Centro-Oeste");
            System.out.println("4 - Sudeste");
            System.out.println("5 - Sul");
            System.out.println("6 - Pesquisar receitas");
            System.out.println("7 - Cadastrar receita");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {

                case 1:
                    listarPorRegiao(receitas, "Norte", teclado);
                    break;

                case 2:
                    listarPorRegiao(receitas, "Nordeste", teclado);
                    break;

                case 3:
                    listarPorRegiao(receitas, "Centro-Oeste", teclado);
                    break;

                case 4:
                    listarPorRegiao(receitas, "Sudeste", teclado);
                    break;

                case 5:
                    listarPorRegiao(receitas, "Sul", teclado);
                    break;

                case 6:
                    pesquisarReceitas(receitas, teclado);
                    break;

                case 7:
                    cadastrarReceita(receitas, teclado, repositorio);
                    break;

                case 0:
                    System.out.println("Obrigado por visitar o DEVBRODERS!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);
    }

    public void listarPorRegiao(ArrayList<Receita> receitas,
                                String nomeRegiao, Scanner teclado) {

        ArrayList<Receita> receitasEncontradas = new ArrayList<>();

        System.out.println("\n===== RECEITAS DA REGIÃO "
                + nomeRegiao.toUpperCase() + " =====");

        for (int i = 0; i < receitas.size(); i++) {

            Receita receita = receitas.get(i);

            if (receita.getRegiao().getNome().equalsIgnoreCase(nomeRegiao)) {

                receitasEncontradas.add(receita);

                System.out.println(receitasEncontradas.size()
                        + " - " + receita.getNome());
            }
        }

        if (receitasEncontradas.isEmpty()) {

            System.out.println("Nenhuma receita cadastrada nesta região.");

        } else {

            System.out.println("0 - Voltar");
            System.out.print("Escolha uma receita: ");

            int opcao = teclado.nextInt();
            teclado.nextLine();

            if (opcao > 0 && opcao <= receitasEncontradas.size()) {

                mostrarReceita(receitasEncontradas.get(opcao - 1));

            } else if (opcao != 0) {

                System.out.println("Opção inválida!");
            }
        }
    }

    public void mostrarReceita(Receita receita) {

        System.out.println("\n===== "
                + receita.getNome().toUpperCase() + " =====");

        System.out.println("Região: "
                + receita.getRegiao().getNome());

        System.out.println("Categoria: "
                + receita.getCategoria().getNome());

        System.out.println("Dificuldade: "
                + receita.getDificuldade());

        System.out.println("Tempo de preparo: "
                + receita.getTempoPreparo());

        System.out.println("\n===== INGREDIENTES =====");

        String[] ingredientes = receita.getIngredientes().split(";");

        for (int i = 0; i < ingredientes.length; i++) {

            System.out.println("° " + ingredientes[i].trim());
        }

        System.out.println("\n===== MODO DE PREPARO =====");

        String[] passos = receita.getModoPreparo().split("\\.");

        for (int i = 1; i < passos.length; i += 2) {

            String passo = passos[i].trim();

            if (!passo.isEmpty()) {

                System.out.println("° " + passo);
            }
        }

        if (!receita.getCuriosidade().isEmpty()) {

            System.out.println("\n===== CURIOSIDADE =====");

            System.out.println(receita.getCuriosidade());
        }
    }

    public void pesquisarReceitas(ArrayList<Receita> receitas,
                                  Scanner teclado) {

        System.out.println("\n===== PESQUISAR RECEITA =====");
        System.out.print("Digite o nome da receita: ");

        String nomePesquisa = teclado.nextLine();

        boolean encontrou = false;

        for (int i = 0; i < receitas.size(); i++) {

            Receita receita = receitas.get(i);

            if (receita.getNome().equalsIgnoreCase(nomePesquisa)) {

                mostrarReceita(receita);

                encontrou = true;
            }
        }

        if (encontrou == false) {

            System.out.println("Receita não encontrada.");
        }
    }

    public void cadastrarReceita(ArrayList<Receita> receitas,
                                 Scanner teclado,
                                 RepositorioReceitas repositorio) {

        System.out.println("\n===== CADASTRAR RECEITA =====");

        System.out.print("Nome da receita: ");
        String nome = teclado.nextLine();

        System.out.print("Ingredientes (separe com ;): ");
        String ingredientes = teclado.nextLine();

        System.out.print("Modo de preparo (separe os passos com .): ");
        String modoPreparo = teclado.nextLine();

        System.out.print("Dificuldade: ");
        String dificuldade = teclado.nextLine();

        System.out.print("Tempo de preparo: ");
        String tempoPreparo = teclado.nextLine();

        System.out.print("Curiosidade: ");
        String curiosidade = teclado.nextLine();

        System.out.print("Região: ");
        String nomeRegiao = teclado.nextLine();

        System.out.print("Categoria: ");
        String nomeCategoria = teclado.nextLine();

        Regiao regiao = new Regiao(nomeRegiao);

        Categoria categoria = new Categoria(nomeCategoria);

        Receita receita = new Receita(
                nome,
                ingredientes,
                modoPreparo,
                dificuldade,
                tempoPreparo,
                curiosidade,
                regiao,
                categoria
        );

        receitas.add(receita);

        repositorio.salvar(receitas);

        System.out.println("\nReceita cadastrada com sucesso!");
    }
}
