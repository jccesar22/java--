package exercicio_oo_1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		System.out.println("enter rectangle width and height");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.Area());
		System.out.printf("PERIMETER = %.2f%n", rect.Perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.Diagonal());
		sc.close();
	}

}
