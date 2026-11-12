public class Receita {

    private String nome;
    private String ingredientes;
    private String modoPreparo;
    private String dificuldade;
    private String tempoPreparo;
    private String curiosidade;

    private Regiao regiao;
    private Categoria categoria;

    public Receita(String nome, String ingredientes, String modoPreparo,
                   String dificuldade, String tempoPreparo, String curiosidade,
                   Regiao regiao, Categoria categoria) {

        this.nome = nome;
        this.ingredientes = ingredientes;
        this.modoPreparo = modoPreparo;
        this.dificuldade = dificuldade;
        this.tempoPreparo = tempoPreparo;
        this.curiosidade = curiosidade;
        this.regiao = regiao;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(String tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public String getCuriosidade() {
        return curiosidade;
    }

    public void setCuriosidade(String curiosidade) {
        this.curiosidade = curiosidade;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}