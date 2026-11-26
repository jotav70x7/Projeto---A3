import java.util.Scanner;

public class Entrada {

    // Le um numero inteiro sem deixar o programa quebrar quando a entrada for invalida
    public static int lerInteiro(Scanner teclado) {

        while (true) {
            String valor = teclado.nextLine().trim();

            try {
                return Integer.parseInt(valor);
            } catch (NumberFormatException erro) {
                System.out.print("Entrada invalida! Digite apenas um numero: ");
            }
        }
    }
}
