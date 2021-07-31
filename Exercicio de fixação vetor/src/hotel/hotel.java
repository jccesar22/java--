package hotel;

import java.util.Locale;
import java.util.Scanner;

import quartos.quartosHotel;
public class hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 1;
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("quantos aluno vão alugar os quatos");
		int n = sc.nextInt();//recebe a quantidade de alunos
		quartosHotel[]  quarto = new quartosHotel[n];
		for(int i= 0; i<n; i++) {
			sc.nextLine();
			System.out.printf("Digite o nome do hospede numero %d \n", cont);
			String nome = sc.nextLine();
			System.out.println("digite seu email");
			String email = sc.nextLine();
			System.out.println("qual quarto ?");
			int quat = sc.nextInt();
			quarto[i] = new quartosHotel(nome, email, quat);
			cont++;
			
		}
		System.out.println(quarto.toString());
		
		sc.close();
		
	}

}
