
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        RepositorioReceitas repositorio = new ArquivoReceitas();

        ArrayList<Receita> receitas = repositorio.carregar();

        // Cadastra as receitas iniciais somente se a lista estiver vazia
        if (receitas.isEmpty()) {

            adicionarReceitasNorte(receitas);

            repositorio.salvar(receitas);

            System.out.println("Receitas iniciais cadastradas!");
        }

        Cardápio cardapio = new Cardápio();

        cardapio.exibirMenu(teclado, receitas, repositorio);

        teclado.close();
    }

    public static void adicionarReceitasNorte(ArrayList<Receita> receitas) {

        Regiao norte = new Regiao("Norte");

        Categoria acompanhamento = new Categoria("Acompanhamento");
        Categoria lanche = new Categoria("Lanche");
        Categoria sobremesa = new Categoria("Sobremesa");
        Categoria pratoPrincipal = new Categoria("Prato principal");

        // Mantenha aqui as oito receitas do Norte que você já cadastrou.
    }
}
