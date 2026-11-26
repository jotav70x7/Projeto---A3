
import java.util.Scanner;

public class PainelAdministrador {

    public void mostrarPainel(Scanner teclado, GerenciadorReceitas gerenciador) {

        int opcao;

        do {
            System.out.println("\n===== PAINEL ADMINISTRATIVO =====");
            System.out.println("1 - Visualizar receitas pendentes");
            System.out.println("2 - Analisar receitas");
            System.out.println("3 - Visualizar receitas aprovadas");
            System.out.println("4 - Editar receita aprovada");
            System.out.println("5 - Excluir receita aprovada");
            System.out.println("0 - Sair do painel");
            System.out.print("Escolha uma opcao: ");

            opcao = Entrada.lerInteiro(teclado);

            switch (opcao) {

                case 1:
                    gerenciador.mostrarPendentes();
                    break;

                case 2:
                    gerenciador.analisarReceitas(teclado);
                    break;

                case 3:
                    gerenciador.mostrarAprovadas();
                    break;

                case 4:
                    gerenciador.editarReceita(teclado);
                    break;

                case 5:
                    gerenciador.excluirReceita(teclado);
                    break;

                case 0:
                    System.out.println("Saindo do painel administrativo...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }

        } while (opcao != 0);
    }
}
