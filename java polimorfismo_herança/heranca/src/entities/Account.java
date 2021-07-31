package entities;

public abstract class Account{
	private Integer number;
	private String holder;
	protected Double balance;
	
	public Account() {//contrutor padrão
		
	}
	public Account(Integer number, String holder, Double balance) {//contrutor segundario
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	public void withdraw(double amount) {
		balance -= amount + 5;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	public String toString() {
		return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + "]";
	}
	
	
	
}
