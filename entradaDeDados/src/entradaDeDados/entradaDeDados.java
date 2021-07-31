package entradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///System.out.println("DIGIte alguma coisa");
		Scanner sc = new Scanner(System.in);
		
		String x ;
		int y ;
		double z;
		//Locale.setDefault(Locale.US);
		System.out.println("Digite um nome:");
		x = sc.next();
		System.out.printf("Digite um numero:");
		y = sc.nextInt();
		System.out.printf("Digite um numero de ponto flutuante: \n");
		z = sc.nextDouble();		
		System.out.println("você digitou um nome: "+ x);
		System.out.printf("você digitou um numero : "+ y);
		System.out.printf("você digitou um numero de ponto flutuante: "+ z);
		
		
		sc.close();
	}

}
