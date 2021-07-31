package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produtct;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
	
		Scanner sc= new Scanner(System.in);
		List<Teste01> list = new ArrayList<>();
		list.add(new Teste01(2, 12000.00));
		
		for(Teste01 emp : list) {
		System.out.println(emp.getAnual());
		System.out.println(emp.toString());
		}
		System.out.println();
		sc.close();
	}

}

