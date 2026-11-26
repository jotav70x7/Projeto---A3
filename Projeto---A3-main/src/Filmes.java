
import java.util.Scanner;

public class Filmes {

    private String[] nomes = {
        "Estomago",
        "Ratatouille",
        "Julie & Julia"
    };

    private String[] sinopses = {
        "Raimundo Nonato chega a uma cidade grande e descobre "
        + "seu talento na cozinha. Aos poucos, conquista espaço "
        + "e muda sua vida atraves da culinaria.",

        "Remy e um rato que sonha em ser um grande chef de cozinha. "
        + "Mesmo enfrentando dificuldades por ser um rato, ele "
        + "encontra uma oportunidade para realizar seu sonho em Paris.",

        "Julie decide preparar as 524 receitas do livro de culinaria "
        + "de Julia Child em um ano. Durante essa jornada, descobre "
        + "novas experiencias e sua paixao pela cozinha."
    };

    public void mostrarFilmes(Scanner teclado) {

        int opcao;

        do {
            System.out.println("\n===== FILMES PARA INSPIRAR =====");

            for (int i = 0; i < nomes.length; i++) {
                System.out.println((i + 1) + " - " + nomes[i]);
            }

            System.out.println("0 - Voltar");
            System.out.print("Escolha um filme: ");

            opcao = teclado.nextInt();

            if (opcao >= 1 && opcao <= nomes.length) {

                System.out.println("\n===== " + nomes[opcao - 1] + " =====");

                System.out.println("\nSinopse:");
                System.out.println(sinopses[opcao - 1]);

            } else if (opcao != 0) {

                System.out.println("Opcao invalida!");
            }

        } while (opcao != 0);
    }
}
