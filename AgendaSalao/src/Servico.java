public class Servico extends Cliente{
    private String tipo;
    private double tempo; // pesquisar import
    private double valor; //pesquisar import

    public Servico(String nome, double tempo, double valor) {
        super();
        this.tipo = tipo;
        this.tempo = tempo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
