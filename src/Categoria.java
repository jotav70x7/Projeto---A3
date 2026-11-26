import java.util.Scanner;

public class Categoria {

    private String nome;

    public Categoria(String nome) {
        this.nome = padronizarNome(nome);
    }

    public String getNome() {
        return nome;
    }

    // Mantem os nomes das categorias sempre no mesmo formato
    private static String padronizarNome(String nome) {

        if (nome.equalsIgnoreCase("Cafe da manha")
                || nome.equalsIgnoreCase("Café da manhã")) {
            return "Café da manhã";
        } else if (nome.equalsIgnoreCase("Almoco")
                || nome.equalsIgnoreCase("Almoço")) {
            return "Almoço";
        } else if (nome.equalsIgnoreCase("Acompanhamento")
                || nome.equalsIgnoreCase("Acompanhamentos")) {
            return "Acompanhamentos";
        } else if (nome.equalsIgnoreCase("Jantar")) {
            return "Jantar";
        } else if (nome.equalsIgnoreCase("Lanche")) {
            return "Lanche";
        } else if (nome.equalsIgnoreCase("Sobremesa")) {
            return "Sobremesa";
        } else if (nome.equalsIgnoreCase("Bebidas")) {
            return "Bebidas";
        } else if (nome.equalsIgnoreCase("Petiscos")) {
            return "Petiscos";
        }

        return nome;
    }

    // Apresenta as categorias para o usuario escolher uma opcao
    public static Categoria selecionarCategoria(Scanner teclado) {

        int opcao;

        do {
            System.out.println("\n===== CATEGORIAS =====");
            System.out.println("1 - Café da manhã");
            System.out.println("2 - Almoço");
            System.out.println("3 - Jantar");
            System.out.println("4 - Lanche");
            System.out.println("5 - Sobremesa");
            System.out.println("6 - Bebidas");
            System.out.println("7 - Acompanhamentos");
            System.out.println("8 - Petiscos");
            System.out.print("Escolha uma categoria: ");

            String entrada = teclado.nextLine();

            try {
                opcao = Integer.parseInt(entrada);
            } catch (NumberFormatException erro) {
                opcao = 0;
            }

            if (opcao < 1 || opcao > 8) {
                System.out.println("Opcao invalida! Tente novamente.");
            }

        } while (opcao < 1 || opcao > 8);

        switch (opcao) {
            case 1:
                return new Categoria("Café da manhã");
            case 2:
                return new Categoria("Almoço");
            case 3:
                return new Categoria("Jantar");
            case 4:
                return new Categoria("Lanche");
            case 5:
                return new Categoria("Sobremesa");
            case 6:
                return new Categoria("Bebidas");
            case 7:
                return new Categoria("Acompanhamentos");
            default:
                return new Categoria("Petiscos");
        }
    }
}
