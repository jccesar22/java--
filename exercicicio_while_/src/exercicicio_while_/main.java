package exercicicio_while_;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Escreva um programa que repita a leitura de uma senha at? que ela seja v?lida. Para cada leitura de senha 
 * incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve 
 * ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta ? o valor
 *  2002.*/
		Scanner sc = new Scanner(System.in);
		System.out.println("digite a senha");
		int senha = sc.nextInt();
		while(senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();			
		}
		System.out.println("Acesso permitido");
		sc.close();
	}

}
