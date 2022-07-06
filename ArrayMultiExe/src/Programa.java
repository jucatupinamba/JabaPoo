import java.util.Scanner;
import java.util.Random;

/*
    Crie um programa de array bidimensional o qual deve digitar o numero de colunas e linhas
    Escolha um número na planilha, o resultado deve apresentar sua posição e os números a sua volta.
 */

public class Programa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int linha, coluna;

        System.out.print("Digite quanta linhas deseja na lista: ");
        linha = scan.nextInt();

        System.out.print("Digite quanta colunas deseja na lista: ");
        coluna = scan.nextInt();
        int [][] array = new int [linha][coluna];

        for(int i = 0; i < coluna; i++){
            for(int j = 0; j < linha; j++){
                array [i][j] = random.nextInt(100);
            }
        }

        for (int[] i: array) { //para cada linha da matriz M
            for (int j : i) { //pegue a coluna desta linhaM
                System.out.print(j + " "); //imprima esta coluna
            }
            System.out.println(); //pular uma linha
        }

        System.out.print("Digite o número que deseja executar: ");
        int num = scan.nextInt();

        for (int[] i: array) { //criar uma lógica que identifica os números ao lado do número selecionado
            for (int j : i) {
                if(j == num){

                    System.out.print("Número digitado" + j + " "); //imprima esta coluna
                    //System.out.print("Coluna anterior " + colunas);
                }

            }
            System.out.println(); //pular uma linha
        }




    }



}
