package exercicio_if5;

import java.util.Locale;
import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a 
		 * quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.*/
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha de 1 ate 5");
		int op1 = teclado.nextInt();
		System.out.println("Escolha a quantidade!");
		int op2 = teclado.nextInt();
		double total = 0;
		if (op1 == 1) {
			total = op2 * 4.00;
		}
		else if(op1 == 2) {
			total = op2 * 4.5;
		}
		else if(op1 == 3) {
			total = op2 * 5.00;
		}
		else if(op1 == 4) {
			total = op2 * 2.00;
		}
		else if(op1 == 5) {
			total = op2 * 1.50;
		}
		System.out.printf("total: R$ %.2f\n", total);
		teclado.close();
	}

}
