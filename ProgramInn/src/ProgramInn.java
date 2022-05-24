import java.util.Locale;
import java.util.Scanner;

public class ProgramInn {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos quartos para alugar?");
		int n = sc.nextInt();
		int i = 0;
		Bedroom[] vect = new Bedroom[10];
		int room;
		
		
		for ( i=0; i<n; i++) {
						
			
			sc.nextLine();
			System.out.print("Digite seu nome: ");
			String name = sc.nextLine();
			System.out.print("Digite seu email: ");
			String email = sc.nextLine();
			System.out.print("Qual quarto deseja? /n(1<10)");
			room = sc.nextInt();
			vect[room]= new Bedroom(name,email);
			sc.nextLine();
		}
		for (i=0; i<n; i++) {
			if(vect[i] != null) {
			System.out.println(i + ":" + vect[i]);
		}
		}
	}
}