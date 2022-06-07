import java.util.Locale;
import java.util.Scanner;

public class ProgramConta {

    public static void main (String [] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        AdmConta conta = new AdmConta();

        // Consulta e lógica para encaminhar a opção
        System.out.println("Digite o que deseja fazer: ");
        System.out.println("1 - abrir conta; 2 - fechar conta; 3 - depósito; " +
                "4 - saque; 5 - mensalidade; 6 - status da conta");
        int opcao = sc.nextInt();
        if (opcao == 1) { //abrir conta
            System.out.println("Digite 1 para abrir conta corrente e 2 para conta poupança: ");
            conta.setTipo(sc.nextInt());

            conta.abrirConta();
            System.out.println("Digite o número da conta: "); //criar gerador de números aleatórios
            conta.setNumConta(sc.nextInt());   // respeito aos princípios do encapsulamento

            System.out.println("Digite seu nome: ");
            sc.nextLine();
            conta.setDono(sc.nextLine());

            System.out.println("Digite 1 para fazer depósito inicial, 2 para finalizar o processo. ");
            int depoInicial = sc.nextInt();
            if(depoInicial == 1){
                System.out.println("Digite o valor do depósito: R$ ");
                conta.deposito(sc.nextDouble());
            }
            else if (depoInicial == 2){
                System.out.println(conta.toString());
            }
            else{
                System.out.println("Numero inválido");
            }
        }
        else if (opcao == 2){
            if(conta.isStatus()) {
                conta.fecharConta();
            }
            else{
                System.out.println(conta.toStringErro());
            }
        }
        else if (opcao == 3){
            if(conta.isStatus()) {  //chamada do método isStatus, true para conta já criada
                System.out.println("Digite o valor do depósito: RS ");
                conta.deposito(sc.nextDouble());
                System.out.println("Depósito realizado com sucesso!");
                System.out.println(conta.toString());
            }
            else{
                System.out.println(conta.toStringErro()); //isStatus = false - mensagem de erro
            }
        }
        else if(opcao == 4){
            if(conta.isStatus()) {
                System.out.println("Digite o valor do saque: RS ");
                conta.sacar(sc.nextDouble());
            }
            else{
                System.out.println(conta.toStringErro());
            }
        }
        else if(opcao == 5){
            if(conta.isStatus()) {
                System.out.println("Qual o tipo da conta? 1 - cc / 2 - cp ");
                conta.pagarMensal(sc.nextDouble());
                System.out.println(conta.toString());
            }
            else{
                System.out.println(conta.toStringErro());
            }
            }
        else if(opcao == 6){
            if(conta.isStatus()) {
                System.out.println(conta.toString());
            }
            else{
                System.out.println(conta.toStringErro());
            }
        }
        System.out.println(conta.toString());
        }
    }

