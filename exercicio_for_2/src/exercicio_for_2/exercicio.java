package exercicio_for_2;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Leia um valor inteiro N. Este valor ser? a quantidade de valores inteiros X que ser?o lidos em seguida.
Mostre quantos destes valores X est?o dentro do intervalo [10,20] e quantos est?o fora do intervalo, mostrando 
essas informa??es conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int in = 0;
		int out = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}
		}
		System.out.printf("%d in \n%d out", in, out);
		sc.close();
	}

}
