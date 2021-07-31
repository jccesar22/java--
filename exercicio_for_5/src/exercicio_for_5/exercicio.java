package exercicio_for_5;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Ler um valor N. Calcular e escrever seu respectivo fatorial. 
 * Fatorial de N = N * (N-1) * (N-2) * (N-3)* ... * 1
 * Lembrando que, por definição, fatorial de 0 é 1.*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fat = 1;
		int i = 1;
		for(i = 1; i <= n; i++) {
			fat *= i;
			
		}
		System.out.printf("soma fatorial %d\n", fat);
		
		sc.close();
	}
	

}
