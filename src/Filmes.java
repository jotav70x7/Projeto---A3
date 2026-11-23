import java.util.Scanner;

public class Filmes {

    private String[] nomes = {
        "Estomago",
        "Ratatouille",
        "Julie & Julia"
    };

    public void mostrarFilmes(Scanner teclado) {
        int opcao;
        do {
            System.out.println("\\n===== FILMES PARA INSPIRAR =====");
            for (int i = 0; i < nomes.length; i++) {
                System.out.println((i + 1) + " - " + nomes[i]);
            }
            System.out.println("0 - Voltar");
            System.out.print("Escolha um filme: ");
            opcao = teclado.nextInt();
            if (opcao >= 1 && opcao <= nomes.length) {
                System.out.println("Voce escolheu: " + nomes[opcao - 1]);
            } else if (opcao != 0) {
                System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);
    }
}
