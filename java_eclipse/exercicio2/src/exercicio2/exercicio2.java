package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com
		 *  quatro casas decimais conforme exemplos.
		 *  Fórmula da área: area = π . 
		 *  raio2 Considere o valor de π = 3.14159*/
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in); 
		double a, r , p;
		p = 3.14159;
		System.out.println("calculando a area");
		r = teclado.nextDouble();
		a = p*(r*r) ;
		System.out.println(a);
	}

}
