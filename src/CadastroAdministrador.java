
import java.util.Scanner;

public class CadastroAdministrador {

    private String codigoAutorizacao = "DEV2026";

    public Administrador realizarCadastro(Scanner teclado) {

        System.out.println("\n===== CADASTRO DE ADMINISTRADOR =====");

        System.out.print("Digite o codigo de autorizacao: ");
        String codigo = teclado.nextLine();

        if (!codigo.equals(codigoAutorizacao)) {
            System.out.println("Codigo de autorizacao incorreto!");
            return null;
        }

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite seu email: ");
        String email = teclado.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = teclado.nextLine();

        if (nome.equals("") || email.equals("") || senha.equals("")) {
            System.out.println("Preencha todos os campos!");
            return null;
        }

        Administrador administrador =
                new Administrador(nome, email, senha);

        System.out.println("\nAdministrador cadastrado com sucesso!");

        return administrador;
    }
}
