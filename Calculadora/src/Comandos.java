public class Comandos {
    private double x;
    private double y;
    private int operacao;
    private double resultado;

    public Comandos(){
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getOperacao() {
        return operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
       switch(getOperacao()){
           case 1: resultado = x + y;
           break;

           case 2: resultado = x - y;
           break;

           case 3: resultado = x * y;
           break;

           case 4: resultado = x / y;
           break;

           default: throw new RuntimeException("Número inválido!");

       }
        this.resultado = resultado;
    }
}
