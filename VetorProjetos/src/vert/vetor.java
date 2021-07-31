package vert;

import java.util.Locale;
import java.util.Scanner;

import entites.Product;

public class vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de produtos");
		int n = sc.nextInt();
		Product[] vect = new Product[n];	
		int cont = 1;
		for(int i=0; i<vect.length; i++) {
			//podendo ser usado en lugar do "n" pode ser usando o .length "vect.length"
			System.out.printf("Digite o novo produto n° %d \n", cont);
			System.out.println("Nome do produto");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Preço do produto");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
			cont++;
		}
		 double soma = 0;
		 for(int i=0; i<n; i++) {
			 soma += vect[i].getPrice();
		 }
		 
		 double res = soma / n;
		 System.out.printf("a media do preço dos %d produto R$%.2f", n, res);
		sc.close();
	}

}
