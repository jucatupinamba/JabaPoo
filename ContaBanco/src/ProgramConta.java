
import java.util.Locale;
import java.util.Scanner;

public class ProgramConta {

    public static void main (String [] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        AdmConta conta = new AdmConta();

        // Consulta e lógica para abrir a conta
        System.out.println("Deseja abrir uma conta? 1 - sim / 2 - não");
        int abrirconta = sc.nextInt();
        if (abrirconta == 1) {
                conta.abrirConta();
                System.out.println("Digite o número da conta: "); //criar gerador de números aleatórios
                conta.setNumConta(sc.nextInt());   // respeito aos princípios do encapsulamento

                System.out.println("Qual conta deseja abrir?");
                System.out.println("Para conta conrrente digite - cc; Para conta poupança digite - cp: ");
                sc.nextLine();
                conta.setTipo(sc.nextLine());

                System.out.println("Deseja fazer um depósito inicial? ");

            }

            // lógica para fechamento da conta / avaliando as condições corretas para fechar
            else if(abrirconta == 2){
                System.out.println("Deseja fechar a conta? 1 - sim / 2 - não");
                int respostaConta = sc.nextInt();
                if (respostaConta ==1){
                    if(conta.isStatus() == true){
                        conta.fecharConta();
                        System.out.println("Sua conta foi fechada com êxito!");
                    }
                    else{
                        System.out.println("Sua conta não foi fechada, existe pendências.");
                        // mostrar as pendências para fechar a conta
                    }


                }
        }
    }
}
