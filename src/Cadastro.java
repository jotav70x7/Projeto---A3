
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

        // Verifica se o email possui um formato basico valido
        int posicaoArroba = email.indexOf("@");
        int ultimoArroba = email.lastIndexOf("@");
        int posicaoPonto = email.indexOf(".", posicaoArroba);

        if (posicaoArroba <= 0
                || posicaoArroba != ultimoArroba
                || posicaoPonto <= posicaoArroba + 1
                || posicaoPonto == email.length() - 1) {

            System.out.println("Email invalido! Digite um email valido.");
            return null;
        }

        Usuario usuario = new Usuario(nome, email, senha);

        String dados = nome + "|" + email + "|" + senha;

        arquivoTexto.salvar(nomeArquivo, dados + "\n");

        System.out.println("\nCadastro realizado com sucesso!");

        return usuario;
    }

    public Usuario carregarUsuario() {

        ArrayList<String> linhas =
                arquivoTexto.lerLinhas(nomeArquivo);

        if (linhas.size() > 0) {

            String[] dados = linhas.get(0).split("\\|", -1);

            if (dados.length == 3) {

                Usuario usuario = new Usuario(
                        dados[0],
                        dados[1],
                        dados[2]
                );

                return usuario;
            }
        }

        return null;
    }
}
