public final class Cliente extends Produto {      //Classe filha de Produto
    private int mesa;

    public Cliente(String nome, int mesa){
        setNome(nome);      //a classe mãe "empresta" métodos (setNome) para trabalho na classe filha
        setMesa(mesa);
    }

    public String pedidoChurras(Churrasco churras) {        //Método pedido churrasco
        return "Nome: " + getNome() + '\n' +
                "Mesa: " + getMesa() + '\n' +
                churras.pedido();
    }

    public String pedidoBuffet(Buffet bf) {                 //Método pedido buffet
        return "Nome: " + getNome() + '\n' +
                "Mesa: " + getMesa() + '\n' +
                bf.pedido();
    }

    public void fazerPedido(Buffet buffet, Churrasco churras){
        buffet.setQuantidade(buffet.getQuantidade() + 1);
        churras.setQuantidade(buffet.getQuantidade() + 1);
    }

    public String cardapio(Churrasco churras){                  //Método para cardápio do churrasco;
        return "Nome: " + churras.getNome() + '\n' +
                "Tipo: " + churras.getTipo() + '\n' +
                "Preço: " + churras.getPreco() + '\n' +
                "Servir: " + churras.getServir() + '\n' +
                "Quantidade: " + churras.getQuantidade();
    }
    public String fecharContaChurras(Buffet buffet){     //Método fechar conta do Churrasco
        return "Nome: " + getNome() + '\n' +
                "Quantidade: " + buffet.getQuantidade() + '\n' +
                "Total: " + buffet.getPreco();

    }
    public String fecharContaChurras(Churrasco ch){     //Método fechar conta do Churrasco
        return "Nome: " + getNome() + '\n' +
                "Tipo: " + ch.getTipo() + '\n' +
                "Quantidade: " + ch.getQuantidade() + '\n' +
                "Total: " + ch.getPreco();

    }

    public String fecharConta(Buffet bf, Churrasco ch){   //necessário revisão, deixar impressão mais amigável
        return "Nome: " + getNome() + '\n' +
                "Mesa: " + getMesa() + '\n' +
                "Produto: " + bf.getNome() + "\n" +
                "Quantidade: " + bf.getQuantidade() + '\n' +
                "\n Produto: " + ch.getNome() + "\n" +
                "Tipo: " + ch.getTipo() + '\n' +
                "Quantidade: " + bf.getQuantidade() + '\n' +
                "Total Gasto: R$ " + setPreco(bf.conta() + ch.conta());  //modificando pela superclasse - preço final

    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

}
