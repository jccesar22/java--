package exercicio3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fazer um programa para ler quatro valores inteiros A, B, C e D. 
		 * A seguir, calcule e mostre a diferen�a do produto de A e B 
		 * pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).*/
		Scanner teclado = new Scanner(System.in);
		int a, b, c, d, diferen�a;
		System.out.println();
		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();
		d = teclado.nextInt();
		
		diferen�a = (a * b - c * d);
		
		System.out.println(diferen�a);
	}

}
