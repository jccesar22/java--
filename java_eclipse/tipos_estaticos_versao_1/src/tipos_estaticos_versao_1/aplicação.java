package tipos_estaticos_versao_1;

import java.util.Locale;
import java.util.Scanner;

import utils.Calculator;

public class aplica��o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circuference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circunference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("Pi value: %.2f\n", Calculator.PI);
		sc.close();
	}

	

}
