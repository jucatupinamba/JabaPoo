import java.util.Locale;
import java.util.Scanner;

public class ProgramConta {

    public static void main (String [] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        AdmConta conta = new AdmConta();

        // Consulta e lógica para abrir a conta
        System.out.println("Digite o que deseja fazer: ");
        System.out.println("1 - abrir conta; 2 - fechar conta; 3 - depósito; " +
                "4 - saque; 5 - mensalidade");
        int opcao = sc.nextInt();
        if (opcao == 1) {
            conta.abrirConta();
            System.out.println("Digite o número da conta: "); //criar gerador de números aleatórios
            conta.setNumConta(sc.nextInt());   // respeito aos princípios do encapsulamento

            System.out.println("Qual conta deseja abrir?");
            System.out.println("Para conta corrente digite - 1; Para conta poupança digite - 2: ");
            sc.nextLine();
            conta.setTipo(sc.nextInt());
            System.out.println("Digite seu nome: ");
            conta.setDono(sc.nextLine());
        }
        else if (opcao == 2){
            conta.fecharConta();
        }
        else if (opcao == 3){

                    System.out.println("Digite o valor do depósito: RS ");
                    conta.deposito(sc.nextDouble());
                    System.out.println("Depósito realizado com sucesso!");
                    System.out.println(conta.toString());
                }
        else if(opcao == 4){
            System.out.println("Digite o valor do saque: RS ");
            conta.sacar(sc.nextDouble());
        }
        else if(opcao == 5){
            System.out.println("Qual o tipo da conta? 1 - cc / 2 - cp ");
            conta.pagarMensal(sc.nextDouble());
        }
        }
    }

