import java.util.Scanner;

public class Aplicação {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        Cliente c[] = new Cliente[3];

        c[0] = new Cliente("Marcos", 2);
        c[1] = new Cliente("Adriando", 1);
        c[2] = new Cliente("Rafael", 3);


        Churrasco chu[] = new Churrasco[2];

        chu[0] = new Churrasco("Espetinho", "Carne", 10.00f,"Assado", 1);
        chu[1] = new Churrasco("Pedaço", "Frango", 5.00f, "Assado", 1);

        Buffet b[] = new Buffet[1];

        b[0] = new Buffet("Buffet Livre", "Alimentos em Geral", 18.50f,"Auto Atendimento", 1 );

        c[2].pedidoBuffet(b[0]);
       c[2].novoPedidoBuffet(b[0]);
       System.out.println(c[2].fecharContaBuffet(b[0]));

       // System.out.println(c[0].pedidoChurras(chu[1]));
    }
}
