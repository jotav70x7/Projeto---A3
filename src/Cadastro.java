import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

    private ArquivoTexto arquivoTexto = new ArquivoTexto();
    private String nomeArquivo = "usuarios.txt";

    public Usuario realizarCadastro(Scanner teclado) {
        System.out.println("\n===== CADASTRO =====");

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

        ArrayList<Usuario> usuarios = carregarUsuarios();
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equalsIgnoreCase(email)) {
                System.out.println("Esse email ja possui cadastro!");
                return null;
            }
        }

        Usuario novoUsuario = new Usuario(nome, email, senha);
        String dados = nome + "|" + email + "|" + senha + "\n";
        arquivoTexto.adicionar(nomeArquivo, dados);

        System.out.println("\nCadastro realizado com sucesso!");
        return novoUsuario;
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

    public ArrayList<Usuario> carregarUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<String> linhas = arquivoTexto.lerLinhas(nomeArquivo);

        for (String linha : linhas) {
            String[] dados = linha.split("\\|", -1);

            if (dados.length == 3) {
                Usuario usuario = new Usuario(dados[0], dados[1], dados[2]);
                usuarios.add(usuario);
            }
        }

        return usuarios;
    }
}
