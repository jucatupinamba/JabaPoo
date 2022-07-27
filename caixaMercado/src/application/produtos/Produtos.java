package application.produtos;

public abstract class Produtos {

    public String nome;
    public String setor;
    public Double valor;

    protected Produtos(final String nome, final String setor, final Double valor) {
        this.nome = nome;
        this.setor = setor;
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(final String setor) {
        this.setor = setor;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(final Double valor) {
        this.valor = valor;
    }
}
