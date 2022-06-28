public final class Cliente extends Produto {
    private int mesa;
    private String pagamento;

    public Cliente(String nome, int mesa){
        setNome(nome);
        setMesa(mesa);
    }

    public String pedidoChurras(Churrasco churras) {
     return "Nome: " + getNome() + '\n' +
             "Mesa: " + getMesa() + '\n' +
             churras.pedido();
    }

    public String pedidoBuffet(Buffet bf) {
        return "Nome: " + getNome() + '\n' +
                "Mesa: " + getMesa() + '\n' +
                bf.pedido();
    }

    public void novoPedidoBuffet(Buffet buffet){
        buffet.setQuantidade(buffet.getQuantidade() + 1);
        buffet.setPreco(buffet.getPreco() * buffet.getQuantidade());
        buffet.novoPedido();
    }

    public String cardapio(Churrasco churras){
        return "Nome: " + churras.getNome() + '\n' +
                "Tipo: " + churras.getTipo() + '\n' +
                "Preço: " + churras.getPreco() + '\n' +
                "Servir: " + churras.getServir() + '\n' +
                "Quantidade: " + churras.getQuantidade();
    }

    public String fecharContaChurras(Churrasco ch){
        return "Nome: " + getNome() + '\n' +
                "Tipo: " + ch.getTipo() + '\n' +
                "Quantidade: " + ch.getQuantidade() + '\n' +
                "Total: " + ch.getPreco();

    }

    public String fecharContaBuffet(Buffet bf){
        return "Nome: " + getNome() + '\n' +
                "Tipo: " + bf.getTipo() + '\n' +
                "Quantidade: " + bf.getQuantidade() + '\n' +
                "Total: " + bf.getPreco();
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }
}
