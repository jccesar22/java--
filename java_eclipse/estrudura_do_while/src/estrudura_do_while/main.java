package estrudura_do_while;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char op;
		do {
			double c = sc.nextDouble();
			double f = (9.0*c/5.0) +32;
			System.out.printf("soma total %.1f",f);
			System.out.println("deseja repetir [s/n]");
			op = sc.next().charAt(0);
		}
		while (op != 'n');
		
		sc.close();
	}

}
