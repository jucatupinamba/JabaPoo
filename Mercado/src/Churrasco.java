public class Churrasco extends Alimentos{
    private int quantidade;
    private String preferencias;

    public Churrasco(String nome, String tipo, double preco, String servir, int quantidade, String preferencias){
        setNome(nome);
        setTipo(tipo);
        setPreco(preco);
        setServir(servir);
        setQuantidade(quantidade);
        setPreferencias(preferencias);

    }

    public void fazerPedido(){                   //abaixo exemplo de polimorfismo de sobrecarga

    }
    public void fazerPedido(int quantidade){
        setQuantidade(getQuantidade()+1);          //adiciona um item ao pedido
    }
    public void fazerPedido(int quantidade, String preferencias){
        setQuantidade(getQuantidade()+1);                             //adiciona item + preferencias (ex: sem cebola)
        this.preferencias = preferencias;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    public String toString() {
        return "Produto" + "\n" +
                "Nome: " + getNome() + '\n' +
                "Tipo: " + getTipo();
    }
}
