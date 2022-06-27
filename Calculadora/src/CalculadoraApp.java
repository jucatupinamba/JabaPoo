import java.util.Scanner;
public class CalculadoraApp {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        Comandos operacao = new Comandos();

        System.out.println("Calculadora");
        System.out.println("Digite o número: ");
        operacao.setX(sc.nextDouble());
        sc.nextLine();

        System.out.println("Digite a operação: ");
        System.out.println("1 = Soma (+)\n" +
                "2 = Subtração (-)\n" +
                "3 = Multiplicação (*)\n" +
                "4 = Divisão (/)");
        operacao.setOperacao(sc.nextInt());

        System.out.println("Digite o número: ");
        operacao.setY(sc.nextDouble());
        try {
            operacao.setResultado(operacao.getOperacao());
            System.out.println("Resultado: " + operacao.getResultado());
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }


    }
}
