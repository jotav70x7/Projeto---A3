
import java.util.ArrayList;
import java.util.Scanner;

public class Favoritos {

    private Receita[] receitasSalvas = new Receita[50];
    private String[] emailsDosFavoritos = new String[50];
    private int quantidade = 0;

    private ArquivoTexto arquivoTexto = new ArquivoTexto();
    private String nomeArquivo = "favoritos.txt";

    public Favoritos() {
        carregarFavoritos();
    }

    // Prepara o texto para salvar no arquivo.
    private String prepararTexto(String texto) {

        return texto.replace("\\", "\\\\")
                .replace("|", "\\|")
                .replace("\n", "\\n")
                .replace("\r", "");
    }

    // Recupera o texto original.
    private String recuperarTexto(String texto) {

        String resultado = "";
        boolean barra = false;

        for (int i = 0; i < texto.length(); i++) {

            char caractere = texto.charAt(i);

            if (barra) {

                if (caractere == 'n') {
                    resultado += "\n";
                } else {
                    resultado += caractere;
                }

                barra = false;

            } else if (caractere == '\\') {

                barra = true;

            } else {

                resultado += caractere;
            }
        }

        if (barra) {
            resultado += "\\";
        }

        return resultado;
    }

    // Separa os campos da receita.
    private ArrayList<String> separarCampos(String linha) {

        ArrayList<String> campos = new ArrayList<>();
        String campo = "";
        boolean barra = false;

        for (int i = 0; i < linha.length(); i++) {

            char caractere = linha.charAt(i);

            if (barra) {

                campo += "\\" + caractere;
                barra = false;

            } else if (caractere == '\\') {

                barra = true;

            } else if (caractere == '|') {

                campos.add(campo);
                campo = "";

            } else {

                campo += caractere;
            }
        }

        if (barra) {
            campo += "\\";
        }

        campos.add(campo);

        return campos;
    }

    // Busca o email do primeiro usuario cadastrado.
    private String carregarEmailPrimeiroUsuario() {

        ArrayList<String> usuarios =
                arquivoTexto.lerLinhas("usuarios.txt");

        if (usuarios.size() > 0) {

            String[] dados = usuarios.get(0).split("\\|", -1);

            if (dados.length == 3) {
                return dados[1];
            }
        }

        return "";
    }

    // Salva todos os favoritos no arquivo TXT.
    private void salvarFavoritos() {

        String texto = "";

        for (int i = 0; i < quantidade; i++) {

            Receita receita = receitasSalvas[i];

            texto += prepararTexto(emailsDosFavoritos[i]) + "|";
            texto += prepararTexto(receita.getNome()) + "|";
            texto += prepararTexto(receita.getRegiao().getNome()) + "|";
            texto += prepararTexto(receita.getCategoria().getNome()) + "|";
            texto += prepararTexto(receita.getOrigem()) + "|";
            texto += prepararTexto(receita.getDificuldade()) + "|";
            texto += prepararTexto(receita.getTempo()) + "|";
            texto += prepararTexto(receita.getIngredientes()) + "|";
            texto += prepararTexto(receita.getModoPreparo()) + "|";
            texto += prepararTexto(receita.getCuriosidade()) + "|";
            texto += prepararTexto(receita.getAutor()) + "|";
            texto += prepararTexto(receita.getStatus()) + "\n";
        }

        arquivoTexto.salvar(nomeArquivo, texto);
    }

    // Carrega os favoritos salvos anteriormente.
    private void carregarFavoritos() {

        ArrayList<String> linhas =
                arquivoTexto.lerLinhas(nomeArquivo);

        String emailAntigo = carregarEmailPrimeiroUsuario();

        for (String linha : linhas) {

            ArrayList<String> dados = separarCampos(linha);

            int inicio;

            // Verifica se o registro é antigo ou novo.
            if (dados.size() == 11) {

                // Favoritos antigos pertencem ao primeiro usuario.
                inicio = 0;

            } else if (dados.size() == 12) {

                inicio = 1;

            } else {

                continue;
            }

            if (quantidade < receitasSalvas.length) {

                String email;

                if (inicio == 0) {
                    email = emailAntigo;
                } else {
                    email = recuperarTexto(dados.get(0));
                }

                Receita receita = new Receita(
                        recuperarTexto(dados.get(inicio)),
                        new Regiao(recuperarTexto(dados.get(inicio + 1))),
                        new Categoria(recuperarTexto(dados.get(inicio + 2))),
                        recuperarTexto(dados.get(inicio + 3)),
                        recuperarTexto(dados.get(inicio + 4)),
                        recuperarTexto(dados.get(inicio + 5)),
                        recuperarTexto(dados.get(inicio + 6)),
                        recuperarTexto(dados.get(inicio + 7)),
                        recuperarTexto(dados.get(inicio + 8)),
                        recuperarTexto(dados.get(inicio + 9)),
                        recuperarTexto(dados.get(inicio + 10))
                );

                receitasSalvas[quantidade] = receita;
                emailsDosFavoritos[quantidade] = email;
                quantidade++;
            }
        }
    }

    // Adiciona uma receita aos favoritos do usuario.
    public void adicionarFavorito(Receita receita, String emailUsuario) {

        for (int i = 0; i < quantidade; i++) {

            if (emailsDosFavoritos[i].equalsIgnoreCase(emailUsuario)
                    && receitasSalvas[i].getNome()
                    .equalsIgnoreCase(receita.getNome())
                    && receitasSalvas[i].getRegiao().getNome()
                    .equalsIgnoreCase(receita.getRegiao().getNome())
                    && receitasSalvas[i].getAutor()
                    .equalsIgnoreCase(receita.getAutor())) {

                System.out.println("Essa receita ja esta nos favoritos!");
                return;
            }
        }

        if (quantidade < receitasSalvas.length) {

            receitasSalvas[quantidade] = receita;
            emailsDosFavoritos[quantidade] = emailUsuario;
            quantidade++;

            salvarFavoritos();

            System.out.println("Receita adicionada aos favoritos!");

        } else {

            System.out.println("Limite de favoritos atingido!");
        }
    }

    // Mostra somente os favoritos do usuario logado.
    public void mostrarFavoritos(String emailUsuario) {

        System.out.println("\n===== MEUS FAVORITOS =====");

        int numero = 0;

        for (int i = 0; i < quantidade; i++) {

            if (emailsDosFavoritos[i].equalsIgnoreCase(emailUsuario)) {

                numero++;

                System.out.println(numero + " - "
                        + receitasSalvas[i].getNome());
            }
        }

        if (numero == 0) {
            System.out.println("Voce ainda nao possui favoritos!");
        }
    }

    // Remove uma receita dos favoritos do usuario.
    public void removerFavorito(Scanner teclado, String emailUsuario) {

        mostrarFavoritos(emailUsuario);

        int[] posicoes = new int[quantidade];
        int total = 0;

        for (int i = 0; i < quantidade; i++) {

            if (emailsDosFavoritos[i].equalsIgnoreCase(emailUsuario)) {
                posicoes[total] = i;
                total++;
            }
        }

        if (total == 0) {
            return;
        }

        System.out.print("\nDigite o numero da receita que deseja remover: ");

        int opcao = teclado.nextInt();
        teclado.nextLine();

        if (opcao >= 1 && opcao <= total) {

            int posicaoReal = posicoes[opcao - 1];

            for (int i = posicaoReal; i < quantidade - 1; i++) {

                receitasSalvas[i] = receitasSalvas[i + 1];
                emailsDosFavoritos[i] = emailsDosFavoritos[i + 1];
            }

            quantidade--;

            receitasSalvas[quantidade] = null;
            emailsDosFavoritos[quantidade] = null;

            salvarFavoritos();

            System.out.println("Receita removida dos favoritos!");

        } else {

            System.out.println("Opcao invalida!");
        }
    }
}
