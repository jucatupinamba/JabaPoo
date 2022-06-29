public class Buffet extends Alimentos {        /*Classe filha de Alimentos
                                                  Pega métodos emprestados da classe mãe e ascendente
                                                  como metodos getNome, setTipo da superclasse Produto.
                                                   */
    private int quantidade;
    private boolean taxaDesperdicio;
        //Método Construtor
    public Buffet(String nome, String tipo, double preco, String servir, int quantidade){
        setNome(nome);
        setTipo(tipo);
        setPreco(preco);
        setServir(servir);
        setQuantidade(quantidade);
    }

    public void novoPedido(){
        getNome();
        getTipo();
        getPreco();
        setQuantidade(quantidade + 1);
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
