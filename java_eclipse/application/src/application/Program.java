package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Products p = new Products();
		
		System.out.println("digite o nome do produto");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price :");
		double price = sc.nextDouble();
	//	System.out.println("Quantity in stock");
		//int quantity = sc.nextInt();
		
		Products product = new Products(name, price);
		
		System.out.println("Product data: " + product); /// pode ser  usado usando apenas o "product"
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.AddProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.RemoveProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
//		System.out.println(product.name + ", " + product.price + ", " + product.quantity);
		sc.close();

	}

}
