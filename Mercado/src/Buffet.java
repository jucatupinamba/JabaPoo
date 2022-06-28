public class Buffet extends Alimentos {
    private int quantidade;
    private boolean taxaDesperdicio;

    public Buffet(String nome, String tipo, double preco, String servir, int quantidade){
        setNome(nome);
        setTipo(tipo);
        setPreco(preco);
        setServir(servir);
        setQuantidade(quantidade);
    }

    public void Conta(){
        getNome();
        getTipo();
        getPreco();
        getQuantidade();
        isTaxaDesperdicio();

    }

    public void novoPedido(){
        getNome();
        getTipo();
        getPreco();
        setQuantidade(quantidade + 1);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isTaxaDesperdicio() {
        return taxaDesperdicio;
    }

    public void setTaxaDesperdicio(boolean taxaDesperdicio) {
        if (isTaxaDesperdicio()){
            setPreco(getPreco() + 20);
        }
        this.taxaDesperdicio = taxaDesperdicio;
    }

    public String pedido() {
        return "Produto" + "\n" +
                "Nome: " + getNome() + '\n' +
                "Tipo: " + getTipo() + '\n' +
                "Quantidade: " + getQuantidade() + '\n' +
                "Preço: " + getPreco() + '\n';
    }
}
