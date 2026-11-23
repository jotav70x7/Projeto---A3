
public class Receita {

    private String nome;
    private Regiao regiao;
    private Categoria categoria;
    private String origem;
    private String dificuldade;
    private String tempo;
    private String ingredientes;
    private String modoPreparo;
    private String curiosidade;
    private String autor;
    private String status;

    public Receita(String nome, Regiao regiao, Categoria categoria, String origem,
                   String dificuldade, String tempo, String ingredientes,
                   String modoPreparo, String curiosidade) {

        this.nome = nome;
        this.regiao = regiao;
        this.categoria = categoria;
        this.origem = origem;
        this.dificuldade = dificuldade;
        this.tempo = tempo;
        this.ingredientes = ingredientes;
        this.modoPreparo = modoPreparo;
        this.curiosidade = curiosidade;
        this.autor = "Equipe DEVBRODERS";
        this.status = "Aprovada";
    }

    public Receita(String nome, Regiao regiao, Categoria categoria, String origem,
                   String dificuldade, String tempo, String ingredientes,
                   String modoPreparo, String curiosidade, String autor, String status) {

        this.nome = nome;
        this.regiao = regiao;
        this.categoria = categoria;
        this.origem = origem;
        this.dificuldade = dificuldade;
        this.tempo = tempo;
        this.ingredientes = ingredientes;
        this.modoPreparo = modoPreparo;
        this.curiosidade = curiosidade;
        this.autor = autor;
        this.status = status;
    }

    public String getNome() { return nome; }
    public String getAutor() { return autor; }
    public String getStatus() { return status; }
    public Regiao getRegiao() { return regiao; }

    public void setNome(String nome) { this.nome = nome; }
    public void setRegiao(Regiao regiao) { this.regiao = regiao; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
    public void setOrigem(String origem) { this.origem = origem; }
    public void setDificuldade(String dificuldade) { this.dificuldade = dificuldade; }
    public void setTempo(String tempo) { this.tempo = tempo; }
    public void setIngredientes(String ingredientes) { this.ingredientes = ingredientes; }
    public void setModoPreparo(String modoPreparo) { this.modoPreparo = modoPreparo; }
    public void setCuriosidade(String curiosidade) { this.curiosidade = curiosidade; }
    public void setStatus(String status) { this.status = status; }

    public void mostrarReceita() {

        System.out.println("\n===== " + nome.toUpperCase() + " =====");
        System.out.println("Regiao: " + regiao.getNome());
        System.out.println("Categoria: " + categoria.getNome());
        System.out.println("Origem: " + origem);
        System.out.println("Dificuldade: " + dificuldade);
        System.out.println("Tempo de preparo: " + tempo);

        System.out.println("\nIngredientes:");
        System.out.println(ingredientes);

        System.out.println("\nModo de preparo:");
        System.out.println(modoPreparo);

        if (!curiosidade.equals("")) {
            System.out.println("\nCuriosidade:");
            System.out.println(curiosidade);
        }

        System.out.println("\nAutor: " + autor);
    }
}
