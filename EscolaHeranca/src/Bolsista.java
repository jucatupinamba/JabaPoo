public class Bolsista extends Aluno {
    private double bolsa;

    public void renovarBolsa(){

    }
    @Override
    public void pagarMensalidade(){
        System.out.println(getNome() + " é bolsista, pagamento facilitado.");
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
