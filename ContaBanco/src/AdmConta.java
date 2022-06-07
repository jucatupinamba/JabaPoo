public class AdmConta {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public AdmConta(){

    }
    public void abrirConta(){
        setStatus(true);
    }

    public void fecharConta(){
        setStatus(false);
    }

    public double deposito(double depositoConta){
        return saldo += depositoConta;
    }

    public double sacar(double saqueConta){
        return saldo -= saqueConta;
    }

    public double pagarMensal(){
        return saldo - 12.00;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String s) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}