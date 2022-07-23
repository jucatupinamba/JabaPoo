public class Churrasco extends Alimentos{
    private int quantidade;
    private String tipo;
    //# MÉTODO CONSTRUTOR - pode definir o estado inicial do objeto
    public Churrasco(String nome, String tipo, double preco, String servir, int quantidade){
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
        setServir(servir);
        this.quantidade = quantidade;
    }
    @Override
    public void fazerPedido(){
        setQuantidade(getQuantidade() + 1);
        setPreco(getPreco() * quantidade);
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double conta(){
        return setPreco(getQuantidade() * getPreco());

    }

    public String pedido() {
        return "Produto" + "\n" +
                "Nome: " + getNome() + '\n' +
                "Tipo: " + getTipo() + '\n' +
                "Quantidade: " + getQuantidade() + '\n' +
                "Preço: " + getPreco() + '\n';
    }
}
