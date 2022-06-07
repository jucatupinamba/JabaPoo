public class AdmConta {

    public int numConta;
    protected Integer tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public AdmConta(){

    }
    public void abrirConta(){
        setStatus(true);
        if(getTipo() == 1){
            setSaldo(50.00); // conta conrrente - bonus 50.00
        }
        else{
            setSaldo(150.00); // conta poupança - bonus 150.00
        }
    }

    public void fecharConta() { // lógica para fechar conta, desde que o saldo esteja zerado
        if (saldo < 0) {
            System.out.println("Você está com saldo devedor. ");
        }
        else if(saldo > 0){
            System.out.println("Sua conta tem dinheiro. ");
        }
        else{
            setStatus(false);
        }
    }
    public double deposito(double depositoConta){ // lógica com princípios de encapsulamento para depósito
        return setSaldo(getSaldo() + depositoConta);
    }

    public void sacar(double sacar){  // evitar saque com saldo zerado
     if(getSaldo() > 0){
         setSaldo(getSaldo() - sacar);
     }
     else{
         System.out.println("Você não possui saldo para saque.");
     }
    }

    public void  pagarMensal(double mensalidade){
        if(isStatus()) {
            if (getTipo() == 1) {
                setSaldo(getSaldo() - 12.00); // taxa conta corrente
            } else {
                setSaldo(getSaldo() - 20.00); // taxa conta poupança
            }
        }
        else{
            System.out.println("Conta fechada");
        }
        }

    public String toString(){
        return "Conta Nº: "
                + getNumConta()
                + " Tipo de Conta: "
                + getTipo()
                + " Nome: "
                + getDono()
                + " Saldo: R$ "
                + getSaldo()
                + " Conta ativa: "
                + isStatus();
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
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

    public double setSaldo(double saldo){
        this.saldo = saldo;
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}