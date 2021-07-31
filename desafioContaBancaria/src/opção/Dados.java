package opção;

public class Dados {

	public int number;
	public String holder;
	public double balance;
	
	public Dados() {
		
	}
	public Dados(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Dados(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public int getNumber() {
		return number;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void RemoveDados(double amount) {
		balance -= balance + 5.0;
	}
	
	public String toString() {
		return "Dados account="
				+ number + 
				", name = "
				+ holder + 
				", deposit= " 
				+ String.format("%.2f", balance);
	}
}
