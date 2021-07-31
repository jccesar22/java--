package exercicio1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		 *  soma desses números com uma mensagem explicativa, conforme exemplos.*/
		int num1, num2, soma;
		Scanner teclado = new Scanner(System.in); 
		System.out.println("Digite os numeros para a soma");
		System.out.println("Digite o primeiro numero");
		num1 = teclado.nextInt();
		System.out.println("Difgite o segundo numero");
		num2 = teclado.nextInt();
		soma = num1 + num2;
		System.out.printf("a soma entre %d + %d = %d",num1, num2, soma);
	}

}
