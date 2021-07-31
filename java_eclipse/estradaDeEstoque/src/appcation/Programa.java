package appcation;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price :");
		double price = sc.nextDouble();
		System.out.println("Quantity in stock");
		int quantity = sc.nextInt();
		Product product = new Product(name, price, quantity);
		System.out.println("Product data: " + product); /// pode ser  usado usando apenas o "product"
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
	    quantity = sc.nextInt();
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
