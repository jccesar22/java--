package exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e mostre: 
		 *  a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura. 
		 *	b) a �rea do c�rculo de raio C. (pi = 3.14159) 
		 *	c) a �rea do trap�zio que tem A e B por bases e C por altura. 
		 *	d) a �rea do quadrado que tem lado B. 
		 *	e) a �rea do ret�ngulo que tem lados A e B*/
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
		System.out.printf("trap�zio:  %.3f \n", tra);
		System.out.printf("quadrado:  %.3f \n", qua);
		System.out.printf("ret�ngulo:  %.3f \n", ret);
		
	}

}
