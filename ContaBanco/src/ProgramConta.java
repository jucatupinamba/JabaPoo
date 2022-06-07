
import java.util.Locale;
import java.util.Scanner;

public class ProgramConta {

    public static void main (String [] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        AdmConta conta = new AdmConta();


        System.out.println("Digite o número da conta: "); //criar gerador de números aleatórios
        conta.setNumConta(sc.nextInt());

        System.out.println("Qual conta deseja abrir?");
        System.out.println("Para conta conrrente digite - cc; Para conta poupança digite - cp: ");
        conta.setTipo(sc.nextLine());

        System.out.println("Qual o nome do usuário da conta? ");
        conta.setDono(sc.nextLine());

    }
}
