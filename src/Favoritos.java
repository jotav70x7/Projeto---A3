import java.util.Scanner;

public class Favoritos {

    private Receita[] receitasSalvas = new Receita[50];
    private int quantidade = 0;

    public void adicionarFavorito(Receita receita) {
        for (int i = 0; i < quantidade; i++) {
            if (receitasSalvas[i] == receita) {
                System.out.println("Essa receita ja esta nos favoritos!");
                return;
            }
        }
        if (quantidade < receitasSalvas.length) {
            receitasSalvas[quantidade] = receita;
            quantidade++;
            System.out.println("Receita adicionada aos favoritos!");
        } else {
            System.out.println("Limite de favoritos atingido!");
        }
    }

    public void mostrarFavoritos() {
        System.out.println("\\n===== MEUS FAVORITOS =====");
        if (quantidade == 0) {
            System.out.println("Voce ainda nao possui favoritos!");
        } else {
            for (int i = 0; i < quantidade; i++) {
                System.out.println((i + 1) + " - " + receitasSalvas[i].getNome());
            }
        }
    }

    public void removerFavorito(Scanner teclado) {
        mostrarFavoritos();
        if (quantidade == 0) {
            return;
        }
        System.out.print("\\nDigite o numero da receita que deseja remover: ");
        int opcao = teclado.nextInt();
        teclado.nextLine();
        if (opcao >= 1 && opcao <= quantidade) {
            for (int i = opcao - 1; i < quantidade - 1; i++) {
                receitasSalvas[i] = receitasSalvas[i + 1];
            }
            quantidade--;
            System.out.println("Receita removida dos favoritos!");
        } else {
            System.out.println("Opcao invalida!");
        }
    }
}
