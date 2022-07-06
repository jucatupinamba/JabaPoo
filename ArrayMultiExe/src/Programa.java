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
        coluna = scan.nextInt();

        System.out.print("Digite quanta colunas deseja na lista: ");
        linha = scan.nextInt();
        int [][] array = new int [linha][coluna];   // descobrir porque o array não aceita colunas e linhas !=

        for(int i = 0; i < coluna; i++){         //captação de dados usando recurso Random
            for(int j = 0; j < linha; j++){
                array [i][j] = random.nextInt(10);
            }
        }

        for (int[] i: array) {                  // for each, impressão do array bidimensional
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println(); //pular uma linha
        }

        System.out.print("Digite o número que deseja executar: ");
        int num = scan.nextInt();

        for (int i = 0; i < array.length; i++) {                   //lógica de manipulação de arrays
            for (int j = 0; j < array.length; j++) {
                if(array[i][j] == num){
                    System.out.println("Posição " + i + "," + j + ":");
                    if(j > 0){
                        System.out.println("Esquerda: " + array[i][j-1]);   //linha -1 = posição á esquerda
                   }
                    if(i > 0){
                        System.out.println("Acima: " + array[i-1][j]);      //coluna -1 = posição acima
                    }
                    if(j < array[i].length -1){
                        System.out.println("Direita: " + array[i][j+1]);     //linha + 1 = posição à direita
                    }
                    if(i < array[j].length -1){
                        System.out.println("Abaixo: " + array[i+1][j]);      // coluna + 1 = posição abaixo
                    }
                }

            }
            System.out.println(); //pular uma linha
        }




    }



}
