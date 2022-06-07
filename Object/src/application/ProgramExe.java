package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductExe;

public class ProgramExe {
// Projeto de conta bancária
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ProductExe account;

		//Entrada de dados nome da conta e proprietário
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		//Lógica para definir depósito inicial, caso usuário necessite
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new ProductExe(number, holder, initialDeposit);
		}
		else {
			account = new ProductExe(number, holder);
		}
		//Saída de dados - Interpretação do estado atual do objeto ProductExe
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		//Método de depósito utilizando os princípios de encapsulamento
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = account.deposit(sc.nextDouble());
		//Saída de dados - impressão do estado atual do objeto ProductExe
		System.out.println("Updated account data:");
		System.out.println(account);
		//Método de saque utilizando os princípios de encapsulamento
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		//Saída de daos - impressão do estado atual do objeto ProductExe
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
		}

}
