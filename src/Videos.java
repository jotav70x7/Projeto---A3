import java.util.Scanner;

public class Videos {

    private String[] nomes = {
        "Como preparar receitas brasileiras",
        "Dicas para iniciantes na cozinha",
        "Receitas simples para o dia a dia"
    };

    private String[] links = {
        "https://www.youtube.com/results?search_query=receitas+brasileiras",
        "https://www.youtube.com/results?search_query=dicas+para+iniciantes+na+cozinha",
        "https://www.youtube.com/results?search_query=receitas+simples"
    };

    public void mostrarVideos(Scanner teclado) {
        int opcao;
        do {
            System.out.println("\n===== VIDEOS DE CULINARIA =====");
            for (int i = 0; i < nomes.length; i++) {
                System.out.println((i + 1) + " - " + nomes[i]);
            }
            System.out.println("0 - Voltar");
            System.out.print("Escolha um video: ");
            opcao = Entrada.lerInteiro(teclado);
            if (opcao >= 1 && opcao <= nomes.length) {
                System.out.println("Acesse: " + links[opcao - 1]);
            } else if (opcao != 0) {
                System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);
    }
}
