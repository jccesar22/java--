package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import produtos.ImpoortedProduct;
import produtos.Product;
import produtos.UsedProduct;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		System.out.print("enter the number of products: ");
		int n = sc.nextInt();
		
		for( int i = 0; i<=n; i++) {
			System.out.println("Common, used or imported (c/u/i)");
			char op = sc.next().charAt(0);
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("price");
			double price = sc.nextDouble();
			if(op == 'c') {
				list.add(new Product(name, price));
			}else if(op == 'u') {
				System.out.print("manuFacture Date");
				//Date manuFactureDate = sc.hasNextShort();
				///list.add(new UsedProduct(name, price, manuFactureDate));
			}else if(op == 'i') {
				System.out.println("Customs fee: ");
				double CustomsFee = sc.nextDouble();
				list.add(new ImpoortedProduct(name, price, CustomsFee));
			}
		}
		
	}

}
