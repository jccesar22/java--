package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.ImportedProduct;
import entities.Produtct;
import entities.UsedProduct;

public class Progam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		System.out.println("Enter the number of products");
		Scanner sc= new Scanner(System.in);
		
		List<Produtct> list = new ArrayList<>();
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			System.out.println("Enter "+ i +" Data" );
			System.out.println("select op the prodtuct(c/u/i)");
			char ch = sc.next().charAt(0);
			System.out.print("name: ");
			String nome = sc.next();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if(ch == 'c') {
				list.add(new Produtct(nome, price));
			}else if(ch == 'i') {
				System.out.println("Customs imporeted");
				Double ImportedProduct = sc.nextDouble();
				list.add(new ImportedProduct(nome, price, ImportedProduct));
			}else if(ch == 'u') {
				list.add(new UsedProduct(nome, price, null));
			}
		}
		System.out.println("--------------------------------");
		System.out.println("-----------listas--------------");
		
		for(Produtct emp : list) {
			System.out.println("nome "+ emp.getNome() + "Preço: " +emp.getPrice());
			System.out.println("nome "+ emp.getNome() + "Preço: " +emp.getPrice());
			System.out.println("nome "+ emp.getNome() + "Preço: " +emp.getPrice()+"Customs imporeted ="+ emp.priceTag());
		}
		
		
		sc.close();
	}

}
