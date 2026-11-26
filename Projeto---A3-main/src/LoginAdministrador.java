
import java.util.Scanner;

public class LoginAdministrador {

    public boolean realizarLogin(Scanner teclado, Administrador administrador) {

        System.out.println("\n===== LOGIN ADMINISTRATIVO =====");

        if (administrador == null) {
            System.out.println("Nenhum administrador cadastrado!");
            return false;
        }

        System.out.print("Digite seu email: ");
        String email = teclado.nextLine().trim();

        System.out.print("Digite sua senha: ");
        String senha = teclado.nextLine();

        if (email.equalsIgnoreCase(administrador.getEmail())
                && senha.equals(administrador.getSenha())) {

            System.out.println("\nLogin administrativo realizado com sucesso!");
            System.out.println("Bem-vindo, " + administrador.getNome() + "!");

            return true;

        } else {

            System.out.println("\nEmail ou senha incorretos!");

            return false;
        }
    }
}
