import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArquivoReceitas implements RepositorioReceitas {

    private String nomeArquivo = "receitas.txt";

    @Override
    public ArrayList<Receita> carregar() {

        ArrayList<Receita> receitas = new ArrayList<>();

        try {
            File arquivo = new File(nomeArquivo);

            if (arquivo.exists()) {

                Scanner leitor = new Scanner(arquivo);

                while (leitor.hasNextLine()) {

                    String linha = leitor.nextLine();
                    String[] dados = linha.split("\\|", -1);

                    if (dados.length == 8) {

                        Regiao regiao = new Regiao(dados[6]);
                        Categoria categoria = new Categoria(dados[7]);

                        Receita receita = new Receita(
                                dados[0],
                                dados[1],
                                dados[2],
                                dados[3],
                                dados[4],
                                dados[5],
                                regiao,
                                categoria
                        );

                        receitas.add(receita);
                    }
                }

                leitor.close();
            }

        } catch (IOException erro) {
            System.out.println("Erro ao carregar receitas.");
        }

        return receitas;
    }

    @Override
    public void salvar(ArrayList<Receita> receitas) {

        try {
            FileWriter escritor = new FileWriter(nomeArquivo);

            for (Receita receita : receitas) {

                escritor.write(
                        receita.getNome() + "|" +
                                receita.getIngredientes() + "|" +
                                receita.getModoPreparo() + "|" +
                                receita.getDificuldade() + "|" +
                                receita.getTempoPreparo() + "|" +
                                receita.getCuriosidade() + "|" +
                                receita.getRegiao().getNome() + "|" +
                                receita.getCategoria().getNome() + "\n"
                );
            }

            escritor.close();

        } catch (IOException erro) {
            System.out.println("Erro ao salvar receitas.");
        }
    }
}