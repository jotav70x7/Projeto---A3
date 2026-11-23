
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ArquivoTexto {

    public void salvar(String nomeArquivo, String texto) {

        try {
            FileWriter escritor = new FileWriter(nomeArquivo, true);

            escritor.write(texto + "\n");

            escritor.close();

        } catch (Exception erro) {
            System.out.println("Erro ao salvar arquivo!");
        }
    }

    public void ler(String nomeArquivo) {

        try {
            File arquivo = new File(nomeArquivo);
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                System.out.println(linha);
            }

            leitor.close();

        } catch (Exception erro) {
            System.out.println("Arquivo ainda nao encontrado!");
        }
    }
}
