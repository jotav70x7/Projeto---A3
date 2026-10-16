
import java.util.Scanner;

public class Cadastro {

    String nome;
    String email;
    String senha;
    boolean cadastrado = false;

    public void realizarCadastro(Scanner teclado) {

        System.out.println("\n===== CADASTRO =====");

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();

        System.out.print("Digite seu e-mail: ");
        email = teclado.nextLine();

        System.out.print("Crie sua senha: ");
        senha = teclado.nextLine();

        cadastrado = true;

        System.out.println("\nCadastro realizado com sucesso!");
    }

    public boolean fazerLogin(Scanner teclado) {

        if (cadastrado == false) {
            System.out.println("\nVocê precisa se cadastrar primeiro!");
            return false;
        }

        System.out.println("\n===== LOGIN =====");

        System.out.print("Digite seu e-mail: ");
        String emailLogin = teclado.nextLine();

        System.out.print("Digite sua senha: ");
        String senhaLogin = teclado.nextLine();

        if (email.equals(emailLogin) && senha.equals(senhaLogin)) {

            System.out.println("\nLogin realizado com sucesso!");
            System.out.println("Bem-vindo(a), " + nome + "!");

            return true;

        } else {

            System.out.println("\nE-mail ou senha incorretos.");

            return false;
        }
    }
}
