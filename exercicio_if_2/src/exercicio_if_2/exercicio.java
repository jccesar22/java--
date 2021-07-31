package exercicio_if_2;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/
		Scanner teclado  = new Scanner(System.in);
		int numero, res;
		System.out.println("Digite um numero e descubra se ele e par ou impar");
		numero = teclado.nextInt();
		res = numero%2;
		if (res == 0) {
			System.out.printf("o numero %d e um munero PAR", numero);
		}else {
			System.out.printf("o numero %d e um numeor impar", numero);
		}
	}

}
