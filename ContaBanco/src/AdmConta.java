public class AdmConta {

    public int NumConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public int getNumConta() {
        return NumConta;
    }

    public AdmConta(){

    }

    public void setNumConta(int NumConta) {
        this.NumConta = NumConta;
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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(){  //continuar à partir deste ponto;

    }
}