import java.util.Scanner;
/*
    Aplicação simples retaurante: conecta o pedido à mesa do cliente; soma o total gasto;
    desconta taxa em comida desperdiçada no Buffet.
    Foram utilizados os princípios de Programação Orientada ao Objeto.
 */
public class Aplicação {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        Cliente c[] = new Cliente[3];

        c[0] = new Cliente("Marcos", 2);
        c[1] = new Cliente("Adriando", 1);
        c[2] = new Cliente("Rafael", 3);


        Churrasco chu[] = new Churrasco[2];


        // objetos com diferentes atributos
        chu[0] = new Churrasco("Espetinho", "Carne", 10.00f,"Assado", 1);
        chu[1] = new Churrasco("Pedaço", "Frango", 5.00f, "Assado", 1);

        Buffet b[] = new Buffet[1];

        b[0] = new Buffet("Buffet Livre",  18.50f,"Auto Atendimento", 1 );



    }
}
