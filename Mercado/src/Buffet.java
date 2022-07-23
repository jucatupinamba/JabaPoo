public class Buffet extends Alimentos {        /*Classe filha de Alimentos
                                                  Pega métodos emprestados da classe mãe e ascendente
                                                  como metodos getNome, setTipo da superclasse Produto.
                                                   */
    private int quantidade;
    //Método Construtor
    public Buffet(String nome, double preco, String servir, int quantidade){
        this.nome = nome;
        this.preco = preco;
        setServir(servir);
        this.quantidade = quantidade;
    }
    @Override
    public void fazerPedido(){
        setQuantidade(quantidade + 1);
        setPreco(getPreco() * quantidade);
    }
    public String pedido() {
        return "Produto" + "\n" +
                "Nome: " + getNome() + '\n' +
                "Quantidade: " + getQuantidade() + '\n' +
                "Preço: " + getPreco() + '\n';
    }
    public double conta(){
        return setPreco(getQuantidade() * getPreco());
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
