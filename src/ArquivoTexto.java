import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ArquivoTexto {

    // Mantem os arquivos TXT na pasta principal do projeto.
    private final Path pastaProjeto;

    public ArquivoTexto() {
        pastaProjeto = localizarPastaProjeto();
    }

    private Path localizarPastaProjeto() {
        try {
            Path pastaClasses = Paths.get(
                    ArquivoTexto.class.getProtectionDomain()
                            .getCodeSource().getLocation().toURI()
            ).toAbsolutePath().normalize();

            if (!Files.isDirectory(pastaClasses)) {
                pastaClasses = pastaClasses.getParent();
            }

            Path encontrada = procurarPastaProjeto(pastaClasses);
            if (encontrada != null) {
                return encontrada;
            }
        } catch (URISyntaxException | NullPointerException erro) {
            // Tenta localizar pelo diretorio atual.
        }

        Path diretorioAtual = Paths.get(System.getProperty("user.dir"))
                .toAbsolutePath().normalize();
        Path encontrada = procurarPastaProjeto(diretorioAtual);

        if (encontrada != null) {
            return encontrada;
        }

        return diretorioAtual;
    }

    private Path procurarPastaProjeto(Path pasta) {
        Path atual = pasta;

        while (atual != null) {
            if (Files.isDirectory(atual.resolve("src"))
                    || Files.exists(atual.resolve("README.md"))) {
                return atual;
            }
            atual = atual.getParent();
        }

        return null;
    }

    private File localizarArquivo(String nomeArquivo) {
        return pastaProjeto.resolve(nomeArquivo).toFile();
    }

    // Substitui o conteudo do arquivo.
    public void salvar(String nomeArquivo, String texto) {
        File arquivo = localizarArquivo(nomeArquivo);

        try {
            FileWriter escritor = new FileWriter(arquivo, false);
            escritor.write(texto);
            escritor.close();
        } catch (IOException erro) {
            System.out.println("Erro ao salvar o arquivo: " + erro.getMessage());
        }
    }

    // Acrescenta texto sem apagar o que ja existe.
    public void adicionar(String nomeArquivo, String texto) {
        File arquivo = localizarArquivo(nomeArquivo);

        try {
            FileWriter escritor = new FileWriter(arquivo, true);
            escritor.write(texto);
            escritor.close();
        } catch (IOException erro) {
            System.out.println("Erro ao adicionar ao arquivo: " + erro.getMessage());
        }
    }

    public void ler(String nomeArquivo) {
        File arquivo = localizarArquivo(nomeArquivo);

        try {
            Scanner leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
                System.out.println(leitor.nextLine());
            }
            leitor.close();
        } catch (IOException erro) {
            System.out.println("Arquivo ainda nao encontrado: " + arquivo.getAbsolutePath());
        }
    }

    public ArrayList<String> lerLinhas(String nomeArquivo) {
        ArrayList<String> linhas = new ArrayList<>();
        File arquivo = localizarArquivo(nomeArquivo);

        try {
            Scanner leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
                linhas.add(leitor.nextLine());
            }
            leitor.close();
        } catch (IOException erro) {
            // Se o arquivo nao existir, retorna uma lista vazia.
        }

        return linhas;
    }
}
