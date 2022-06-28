public class Churrasco extends Alimentos{
    private int quantidade;

    public Churrasco(String nome, String tipo, double preco, String servir, int quantidade){
        setNome(nome);
        setTipo(tipo);
        setPreco(preco);
        setServir(servir);
        setQuantidade(quantidade);
    }

    public void fazerPedido(){                   //abaixo exemplo de polimorfismo de sobrecarga

    }
    public void fazerPedido(int quantidade){
        setQuantidade(getQuantidade()+1);          //adiciona um item ao pedido
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String pedido() {
        return "Produto" + "\n" +
                "Nome: " + getNome() + '\n' +
                "Tipo: " + getTipo() + '\n' +
                "Quantidade: " + getQuantidade() + '\n' +
                "Preço: " + getPreco() + '\n';
    }
}
