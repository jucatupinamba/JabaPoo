public abstract class Produto {
    public String nome;
    public String tipo;
    public Integer quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String toString() {
        return "Produto" + "\n" +
                "Nome: " + getNome() + '\'' +
                "Tipo: " + getTipo() + '\'' +
                "Quantidade: " + getQuantidade();
    }
}
