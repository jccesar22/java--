package aplication;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entititiess.Employee;
import entititiess.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		System.out.println("Enter the nuimber of employyes");
		int n = sc.nextInt();
		for(int i = 1; i<=n ; i++) {
			System.out.print("Employee "+ i +" data: ");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				/*Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);*/
				// o codigo de cima pode ser editado dessa forma debaixo
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
				
			}
			else {
				//Employee emp = new Employee(name, hours, valuePerHour);
				// editado nesse casso não precisa de criar a variaveel emp
				list.add(new Employee(name, hours, valuePerHour));
			}
			}
			System.out.println("--------------------------------");
			System.out.println("-----------PAYMENTS--------------");
			
			for(Employee emp : list) {
				System.out.println(emp.getName()+ " - $ "+ String.format("%.2f", emp.payment()));
			}
			
			
		
		
		sc.close();
	}

}
