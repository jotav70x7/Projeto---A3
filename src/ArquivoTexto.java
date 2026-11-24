
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ArquivoTexto {

    public void salvar(String nomeArquivo, String texto) {

        try {
            // false permite substituir o conteudo anterior
            FileWriter escritor = new FileWriter(nomeArquivo, false);

            escritor.write(texto);

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

    public ArrayList<String> lerLinhas(String nomeArquivo) {

        ArrayList<String> linhas = new ArrayList<>();

        try {
            File arquivo = new File(nomeArquivo);
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {
                linhas.add(leitor.nextLine());
            }

            leitor.close();

        } catch (Exception erro) {
            // Se o arquivo nao existir, a lista fica vazia
        }

        return linhas;
    }
}
