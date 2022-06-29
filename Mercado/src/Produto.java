public abstract class Produto {         /*  Classe abstrata; superclasse que não permite instanciar objeto diretamente;
                                            As classes descendentes podem utilizar seus métodos através do Polimorfismo
                                            De sobrescrição, desde que mantidos os mesmos parâmetros.
                                            A relação de Herança é explícita na importação dos métodos da superclasse
                                            pelas subclasses relacionadas.*/
    public String nome;
    public String tipo;
     public double preco;

    public String getNome() {          //Nome pode ser utilizado tanto para Cliente quanto Alimentos
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {           //Mesmo conceito acima utilizado em todos os seus métodos
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public double setPreco(double preco) {
        this.preco = preco;
        return preco;
    }

}
