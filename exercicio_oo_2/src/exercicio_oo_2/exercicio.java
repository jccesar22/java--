package exercicio_oo_2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("nome: ");
		emp.nome = sc.nextLine();
		System.out.println("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.println("tax");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: "+ emp);
		System.out.println();
		System.out.println("whic percentage yo increase salary? ");
		double percentage = sc.nextDouble();
		emp.IncreaseSalary(percentage);

		System.out.println();
		System.out.println("Updated data: " + emp);
		sc.close();
	}

}
