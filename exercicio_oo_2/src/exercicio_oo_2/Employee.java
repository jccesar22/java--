package exercicio_oo_2;

public class Employee {
	public String nome;
	public double grossSalary;
	public double tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	public void IncreaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
	public String toString() {
		return nome +", $ "+ String.format("%.2f", NetSalary());
	}
}
