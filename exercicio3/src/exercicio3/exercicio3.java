package exercicio3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fazer um programa para ler quatro valores inteiros A, B, C e D. 
		 * A seguir, calcule e mostre a diferença do produto de A e B 
		 * pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
		Scanner teclado = new Scanner(System.in);
		int a, b, c, d, diferença;
		System.out.println();
		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();
		d = teclado.nextInt();
		
		diferença = (a * b - c * d);
		
		System.out.println(diferença);
	}

}
