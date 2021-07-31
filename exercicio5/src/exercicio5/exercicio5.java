package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
		 *  o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		int pc1, pc2, n1, n2;
		double valor1, valor2, total;
		System.out.print("primeira peça: ");
		pc1 = teclado.nextInt();
		System.out.print("numero da primeira peça: ");
		n1 = teclado.nextInt();
		System.out.print("valor da primeira peça: ");
		valor1 = teclado.nextDouble();
		System.out.print("segunda peça: ");
		pc2 = teclado.nextInt();
		System.out.print("numero da segunda peça");
		n2 = teclado.nextInt();
		System.out.print("valor da segunda peça");
		valor2 = teclado.nextDouble();
		total = (n1*valor1)+(n2 *valor2) ;
		System.out.printf("valor a a pagar %.2f", total);
		
		
		
	}

}
