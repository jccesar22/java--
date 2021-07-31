package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");

	System.out.print("Enter departament´s name: ");
	String departamentName = sc.nextLine();
	System.out.println("Enter Worker data: ");
	System.out.print("Name: ");
	String workerName = sc.nextLine();
	System.out.print("Level: ");
	String workeLevel = sc.nextLine();
	System.out.print("Base salary: ");
	double baseSalary = sc.nextDouble();
	
	Worker worker = new Worker(workerName, WorkerLevel.valueOf(workeLevel), baseSalary, new  Departament(departamentName));
	
	System.out.print("how many cointracts to this worker?: ");
	int n = sc.nextInt();
	//laço for para colocar a classe worker como argumento para quue possa cadastrar dia e horas 
	for(int i =1; i<=n; i++) {
		System.out.printf("Enter contrct #"+ i + "data\n");
		System.out.print("Date (DD/MM/YYYY): ");
		Date contractDate = sdf.parse(sc.next());
		System.out.print("Value per hours: ");
		double valuePerHor = sc.nextDouble();
		System.out.print("Duration (Hours): ");
		int hours = sc.nextInt();
		HourContract contract = new HourContract(contractDate, valuePerHor, hours);
		 worker.addContract(contract);
	}
	System.out.println();
	System.out.println("Enter month and year to calculate income(MM/YYY)");
	String monthAndYear = sc.next();
	int month = Integer.parseInt(monthAndYear.substring(0, 2));
	int year = Integer.parseInt(monthAndYear.substring(3));
	System.out.println("Name: "+worker.getName());
	System.out.println("Departament; "+worker.getDepartamento());
	System.err.println("Income for "+ monthAndYear + ": " + String.format("%.2f", worker.income(year, month))) ;
	sc.close();
	
	}

}
