import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public Usuario realizarLogin(Scanner teclado, ArrayList<Usuario> usuarios) {
        System.out.println("\n===== LOGIN =====");

        if (usuarios.isEmpty()) {
            System.out.println("Voce ainda nao possui cadastro!");
            return null;
        }

        System.out.print("Digite seu email: ");
        String email = teclado.nextLine().trim();

        System.out.print("Digite sua senha: ");
        String senha = teclado.nextLine();

        for (Usuario usuario : usuarios) {
            if (email.equalsIgnoreCase(usuario.getEmail())
                    && senha.equals(usuario.getSenha())) {
                System.out.println("\nLogin realizado com sucesso!");
                System.out.println("Bem-vindo, " + usuario.getNome() + "!");
                return usuario;
            }
        }

        System.out.println("\nEmail ou senha incorretos!");
        return null;
    }
}
