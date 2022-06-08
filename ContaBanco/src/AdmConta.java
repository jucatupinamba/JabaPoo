public class AdmConta {

    public int numConta;
    protected int tipo;
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
    public void deposito(double depositoConta){ // lógica com princípios de encapsulamento para depósito
        if (isStatus()) {
            setSaldo(getSaldo() + depositoConta);
        }
        else{
            toStringErro();
        }
    }

    public void sacar(double sacar){  // evitar saque com saldo zerado
         if(isStatus()) {
             if (getSaldo() <= sacar) {
                 System.out.println("Você não possui saldo para saque.");
             } else {
                 setSaldo(getSaldo() - sacar);
             }
         }
         else{
             toStringErro();
         }
    }

    public void  pagarMensal(double mensalidade){
        if(isStatus()) {
            if (getTipo() == 1) {
                if(mensalidade > getSaldo()){
                    System.out.println("Saldo insuficiente");
                }
                else {
                    setSaldo(getSaldo() - 12.00); // taxa conta corrente
                }
            }
            else if(getTipo() == 2){
                if(mensalidade < getSaldo()) {
                    System.out.println("Saldo insuficiente"); //entendo que não se deve ter String em método;
                }
                else{
                    setSaldo(getSaldo() - 20.00); // taxa conta poupança
                }
            }
        }
        else{
            toStringErro();
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

    public String toStringErro(){ // método String para casos de erro
        return "Conta inexistente";
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