
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Scanner;

public class Favoritos {

    private Receita[] receitasSalvas = new Receita[50];
    private int quantidade = 0;

    private ArquivoTexto arquivoTexto = new ArquivoTexto();
    private String nomeArquivo = "favoritos.txt";

    public Favoritos() {
        carregarFavoritos();
    }

    // Transforma o texto para poder salvar no arquivo
    private String codificar(String texto) {
        return Base64.getEncoder().encodeToString(
                texto.getBytes(StandardCharsets.UTF_8)
        );
    }

    // Recupera o texto original
    private String decodificar(String texto) {
        return new String(
                Base64.getDecoder().decode(texto),
                StandardCharsets.UTF_8
        );
    }

    // Salva todos os favoritos no arquivo
    private void salvarFavoritos() {

        String texto = "";

        for (int i = 0; i < quantidade; i++) {

            Receita receita = receitasSalvas[i];

            texto += codificar(receita.getNome()) + "|";
            texto += codificar(receita.getRegiao().getNome()) + "|";
            texto += codificar(receita.getCategoria().getNome()) + "|";
            texto += codificar(receita.getOrigem()) + "|";
            texto += codificar(receita.getDificuldade()) + "|";
            texto += codificar(receita.getTempo()) + "|";
            texto += codificar(receita.getIngredientes()) + "|";
            texto += codificar(receita.getModoPreparo()) + "|";
            texto += codificar(receita.getCuriosidade()) + "|";
            texto += codificar(receita.getAutor()) + "|";
            texto += codificar(receita.getStatus()) + "\n";
        }

        arquivoTexto.salvar(nomeArquivo, texto);
    }

    // Carrega os favoritos salvos anteriormente
    private void carregarFavoritos() {

        ArrayList<String> linhas =
                arquivoTexto.lerLinhas(nomeArquivo);

        for (String linha : linhas) {

            String[] dados = linha.split("\\|", -1);

            if (dados.length == 11 && quantidade < receitasSalvas.length) {

                Receita receita = new Receita(
                        decodificar(dados[0]),
                        new Regiao(decodificar(dados[1])),
                        new Categoria(decodificar(dados[2])),
                        decodificar(dados[3]),
                        decodificar(dados[4]),
                        decodificar(dados[5]),
                        decodificar(dados[6]),
                        decodificar(dados[7]),
                        decodificar(dados[8]),
                        decodificar(dados[9]),
                        decodificar(dados[10])
                );

                receitasSalvas[quantidade] = receita;
                quantidade++;
            }
        }
    }

    public void adicionarFavorito(Receita receita) {

        for (int i = 0; i < quantidade; i++) {

            if (receitasSalvas[i].getNome().equalsIgnoreCase(receita.getNome())
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
            quantidade++;

            salvarFavoritos();

            System.out.println("Receita adicionada aos favoritos!");

        } else {
            System.out.println("Limite de favoritos atingido!");
        }
    }

    public void mostrarFavoritos() {

        System.out.println("\n===== MEUS FAVORITOS =====");

        if (quantidade == 0) {

            System.out.println("Voce ainda nao possui favoritos!");

        } else {

            for (int i = 0; i < quantidade; i++) {
                System.out.println((i + 1) + " - "
                        + receitasSalvas[i].getNome());
            }
        }
    }

    public void removerFavorito(Scanner teclado) {

        mostrarFavoritos();

        if (quantidade == 0) {
            return;
        }

        System.out.print("\nDigite o numero da receita que deseja remover: ");

        int opcao = teclado.nextInt();
        teclado.nextLine();

        if (opcao >= 1 && opcao <= quantidade) {

            for (int i = opcao - 1; i < quantidade - 1; i++) {
                receitasSalvas[i] = receitasSalvas[i + 1];
            }

            quantidade--;

            receitasSalvas[quantidade] = null;

            salvarFavoritos();

            System.out.println("Receita removida dos favoritos!");

        } else {
            System.out.println("Opcao invalida!");
        }
    }
}
