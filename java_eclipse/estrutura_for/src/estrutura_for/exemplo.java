package estrutura_for;

import java.util.Scanner;

public class exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int soma = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			soma += x;	
		}
		System.out.printf("soma dos numeros digitados %d ", soma);
		sc.close();
	}

}
