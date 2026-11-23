import java.util.Scanner;

public class Login {

    public boolean realizarLogin(Scanner teclado, Usuario usuario) {
        System.out.println("\\n===== LOGIN =====");
        if (usuario == null) {
            System.out.println("Voce ainda nao possui cadastro!");
            return false;
        }
        System.out.print("Digite seu email: ");
        String email = teclado.nextLine();
        System.out.print("Digite sua senha: ");
        String senha = teclado.nextLine();

        if (email.equals(usuario.getEmail()) && senha.equals(usuario.getSenha())) {
            System.out.println("\\nLogin realizado com sucesso!");
            System.out.println("Bem-vindo, " + usuario.getNome() + "!");
            return true;
        } else {
            System.out.println("\\nEmail ou senha incorretos!");
            return false;
        }
    }
}
