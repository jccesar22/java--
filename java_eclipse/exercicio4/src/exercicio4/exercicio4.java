package exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
		 * o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o 
		 * número e o salário do funcionário, com duas casas decimais*/
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		double salario, horas, total;
		int funcionario;
		System.out.print("Numero do fucionario: ");
		funcionario = teclado.nextInt();
		System.out.print("Salario: ");
		salario = teclado.nextDouble();
		System.out.print("horas: ");
		horas = teclado.nextDouble();
		
		total = (double)salario * horas;
		System.out.printf("numero %d \nsalario %.2f",funcionario, total);
		teclado.close();
	}

}
