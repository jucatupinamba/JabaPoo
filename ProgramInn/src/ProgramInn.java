
import java.text.ParseException;
import java.util.Scanner;

/*
 * Programa de aluguel de quartos. 10 quartos com vetores iniciados.
 * Seleção de quarto de acordo com vetor disponível.
 */

public class ProgramInn {

	public static void main(String[] args) throws ParseException {
		
	
		Scanner sc = new Scanner(System.in);
	
		Bedroom[] lista = new Bedroom[10];

		// Captação de dados, quantidade de quartos para alugar.
		System.out.println("Quantos quartos deseja alugar? ");
		int quantQuarto = sc.nextInt();

		// lógica de captação de dados do usuário, vinculado à quantidade de quartos
		for (int i=0; i<quantQuarto; i++) {
			
			System.out.println();
			System.out.println("Digite nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Digite o email: ");
			String email = sc.nextLine();
			System.out.println("Qual quarto deseja alugar? (0<9) ");
			int numero = sc.nextInt();
			lista[numero] = new Bedroom(name, email);
		}
		
		sc.close();

		//lógica de saída de dados; * Está imprimindo vetores vazios
		for (int i=0; i<10 ; i++) {
			if(lista[i] != null) {
				System.out.println();
				System.out.println(lista[i]);
					
		}
	}
	}
}