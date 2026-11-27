
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroAdministrador {

    private String codigoAutorizacao = "DEV2026";

    private ArquivoTexto arquivoTexto = new ArquivoTexto();
    private String nomeArquivo = "administradores.txt";

    public Administrador realizarCadastro(Scanner teclado) {

        System.out.println("\n===== CADASTRO DE ADMINISTRADOR =====");

        if (carregarAdministrador() != null) {
            System.out.println("Ja existe um administrador cadastrado!");
            return null;
        }

        System.out.print("Digite o codigo de autorizacao: ");
        String codigo = teclado.nextLine().trim();

        if (!codigo.equals(codigoAutorizacao)) {
            System.out.println("Codigo de autorizacao incorreto!");
            return null;
        }

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine().trim();

        System.out.print("Digite seu email: ");
        String email = teclado.nextLine().trim();

        System.out.print("Digite sua senha: ");
        String senha = teclado.nextLine().trim();

        if (nome.equals("") || email.equals("") || senha.equals("")) {
            System.out.println("Preencha todos os campos!");
            return null;
        }

        if (!emailValido(email)) {
            System.out.println("Email invalido! Digite um email valido.");
            return null;
        }

        Administrador administrador =
                new Administrador(nome, email, senha);

        String dados = nome + "|" + email + "|" + senha;

        arquivoTexto.salvar(nomeArquivo, dados + "\n");

        System.out.println("\nAdministrador cadastrado com sucesso!");

        return administrador;
    }

    private boolean emailValido(String email) {
        int arroba = email.indexOf("@");
        if (arroba <= 0 || arroba != email.lastIndexOf("@")
                || arroba == email.length() - 1) {
            return false;
        }

        String parteLocal = email.substring(0, arroba);
        String dominio = email.substring(arroba + 1);

        if (!parteLocal.matches("[A-Za-z0-9._%+-]+")
                || parteLocal.startsWith(".") || parteLocal.endsWith(".")
                || parteLocal.contains("..")
                || !dominio.matches("[A-Za-z0-9.-]+")
                || !dominio.contains(".") || dominio.startsWith(".")
                || dominio.endsWith(".") || dominio.contains("..")) {
            return false;
        }

        String[] partesDominio = dominio.split("\\.");
        for (String parte : partesDominio) {
            if (parte.isEmpty() || parte.startsWith("-") || parte.endsWith("-")) {
                return false;
            }
        }

        return true;
    }

    public Administrador carregarAdministrador() {

        ArrayList<String> linhas =
                arquivoTexto.lerLinhas(nomeArquivo);

        if (linhas.size() > 0) {

            String[] dados = linhas.get(0).split("\\|", -1);

            if (dados.length == 3) {

                Administrador administrador =
                        new Administrador(
                                dados[0],
                                dados[1],
                                dados[2]
                        );

                return administrador;
            }
        }

        return null;
    }
}
