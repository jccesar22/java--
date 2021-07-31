package exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre: 
		 *  a) a área do triângulo retângulo que tem A por base e C por altura. 
		 *	b) a área do círculo de raio C. (pi = 3.14159) 
		 *	c) a área do trapézio que tem A e B por bases e C por altura. 
		 *	d) a área do quadrado que tem lado B. 
		 *	e) a área do retângulo que tem lados A e B*/
		Locale.setDefault(Locale.US);
		double a, b, c, tr, cir, tra, qua, ret,pi = 3.14159;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("valor de A");
		a = teclado.nextDouble();
		System.out.println("Valor de B");
		b = teclado.nextDouble();
		System.out.println("Valor de C");
		c = teclado.nextDouble(); 
		
		tr = a * c /2;
		cir = c * pi;
		tra = ((a + b)*c )/ 2;
		qua = b * b;
		ret = a * b;
		
		System.out.printf("Triangulo: %.3f \n", tr);
		System.out.printf("circulo:  %.3f \n", cir);
		System.out.printf("trapézio:  %.3f \n", tra);
		System.out.printf("quadrado:  %.3f \n", qua);
		System.out.printf("retângulo:  %.3f \n", ret);
		
	}

}
