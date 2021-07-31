package entities;

public  class SaveAccount extends Account{
	
	private Double interestRate;
	
	/*public SaveAccount(){
		super();
	}*/

	public SaveAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	//sobre carga da class Account 
	// serpre colocar o @Override para que possa sobreescrever a super classe
	@Override
	public  void withdraw(double amount) {
		balance -= amount;
	}
}
