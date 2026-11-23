import java.util.Scanner;

public class Cadastro {

    public Usuario realizarCadastro(Scanner teclado) {
        System.out.println("\\n===== CADASTRO =====");
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite seu email: ");
        String email = teclado.nextLine();
        System.out.print("Digite sua senha: ");
        String senha = teclado.nextLine();

        if (nome.equals("") || email.equals("") || senha.equals("")) {
            System.out.println("Preencha todos os campos!");
            return null;
        } else {
            Usuario usuario = new Usuario(nome, email, senha);
            System.out.println("\\nCadastro realizado com sucesso!");
            return usuario;
        }
    }
}
