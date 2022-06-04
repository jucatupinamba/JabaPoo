 
package entities;


public class ProductExe {
	//atribudos do objeto ProductExe
	private int number;
	private String holder;
	private double balance;
	
	public ProductExe(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public ProductExe(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	// Método de depósito
	public void deposit(double amount) {
		balance += amount;
	}
	// Método de saque
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	//Impressão de dados
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
