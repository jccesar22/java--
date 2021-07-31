package repeticãoWhile;

import java.util.Scanner;

public class repeticão {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int soma = 0;
		while (n != 0) {
			soma += n;
			n = sc.nextInt();
			
			
		}
		System.out.printf("total %d", soma);
		sc.close();
	}

}
