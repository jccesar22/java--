package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	public String name;
	public WorkerLevel level;
	public double baseSalary;
	
	private Departament departamento;
	//linha abaixo sempre inicie ele com o "new" não colocar lista como construtores
	private List<HourContract> contracts = new ArrayList<>();
	
	private Worker() {
		
	}

	public Worker(String name, WorkerLevel level, double baseSalary, Departament departamento) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departamento = departamento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departament departamento) {
		this.departamento = departamento;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
//sempre remover o "set" por motivos de que a lista não pode ser editada, apenas adicionada e removida
	/*public void setContracts(List<HourContract> contracts) {
		this.contracts = contracts;
	}
	*/
	public  void addContract(HourContract contract) {
		contracts.add(contract);//colocar como contras para receber os argumentos
	}
	public void removeContract(HourContract contact) {
		contracts.remove(contracts);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract c: contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
					
				
			}
		}
		return sum;
	}
	
	
}
