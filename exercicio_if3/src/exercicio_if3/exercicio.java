package exercicio_if3;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", 
		 * indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem crescente ou decrescente.*/
		
		Scanner teclado = new Scanner(System.in);
		int n1, n2;
		System.out.println("digite o primeiro numero");
		n1 = teclado.nextInt();
		System.out.println("digite o segundo numero");
		n2 = teclado.nextInt();
		if (n2 % n1== 0 || n1 % n2 == 0) {
			System.out.println("S�o multiplos");
		}
		else {
			System.out.println("N�o s�o multiplos");
		}
	}

}
