package desafioContaBancaria;

import java.util.Locale;
import java.util.Scanner;
import opção.Dados;

public class Conta {

	public static void main(String[] args) {
		
	
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		Dados dados;

		System.out.print("Number account:");		
		int number = sc.nextInt();
		
		System.out.print("Name: ");
		sc.nextLine();
		String holder = sc.nextLine();
	
		System.out.print("Is there na initial deposit (y/n)?");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			dados = new Dados(number, holder, initialDeposit);
		}
		else {
			dados = new Dados(number, holder);
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(dados);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		dados.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(dados);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		dados.RemoveDados(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println("dados " + dados);
		/*
		System.out.println();
		System.out.println("Enter deposit value");
		double  deposito = sc.nextDouble();
		dados.deposit(deposito);
		System.out.println("teste");
		System.out.println();
		
		System.out.println("Enter remove deposit");
		double  remove = sc.nextDouble();
		dados.deposit(remove);
		System.out.println("teste");
		System.out.println("teste");
		
*/
			
		
		
		sc.close();
	}

}
