package contribuinte;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import pessoas.PessoasContribuintes;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<PessoasContribuintes>list = new ArrayList<>();
		list.add(new PessoasContribuintes("juridica",20000.00, 8));
		
		for(PessoasContribuintes r : list) {
			System.out.println("aki "+ r.getImposto());
			System.out.println(r.renda(0));
			System.out.print(r.getAnual());
		}
	
		
		sc.close();
	}

}
