package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class HostelProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos quartos para alugar?");
		int n = sc.nextInt();
		int i = 0, empty = 0;
	
		
		
		for ( i=0; i<10; i++) {
						
			
			sc.nextLine();
			System.out.print("Digite seu nome: ");
			String name = sc.nextLine();
			System.out.print("Digite seu email: ");
			String email = sc.nextLine();
			System.out.print("Qual quarto deseja? (1<10)");
			int room = sc.nextInt();
			vect[i]= Bedroom();
		
		}
		for (i=0; i<n; i++) {
		System.out.println(vect[i]);
		System.out.printf("Nome:"); //Imprimir relação de dados
		
		}
		System.out.println("Quartos vazio " + empty ); // relação quartos vazios
		sc.close();
		}


}