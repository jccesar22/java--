package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1,
		 *  o c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.*/
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		int pc1, pc2, n1, n2;
		double valor1, valor2, total;
		System.out.print("primeira pe�a: ");
		pc1 = teclado.nextInt();
		System.out.print("numero da primeira pe�a: ");
		n1 = teclado.nextInt();
		System.out.print("valor da primeira pe�a: ");
		valor1 = teclado.nextDouble();
		System.out.print("segunda pe�a: ");
		pc2 = teclado.nextInt();
		System.out.print("numero da segunda pe�a");
		n2 = teclado.nextInt();
		System.out.print("valor da segunda pe�a");
		valor2 = teclado.nextDouble();
		total = (n1*valor1)+(n2 *valor2) ;
		System.out.printf("valor a a pagar %.2f", total);
		
		
		
	}

}
