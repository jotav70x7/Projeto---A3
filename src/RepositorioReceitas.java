import java.util.ArrayList;

public interface RepositorioReceitas {

    ArrayList<Receita> carregar();

    void salvar(ArrayList<Receita> receitas);

}