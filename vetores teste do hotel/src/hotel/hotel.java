package hotel;

import java.util.Locale;
import java.util.Scanner;

import AlugaQuartos.Aluga;
public class hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluga[] aluga = new Aluga[10];
		int cont = 1;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("quantos aluno vão alugar os quatos");
		int n = sc.nextInt();//recebe a quantidade de alunos
		//Aluga[] aluga = new Aluga[10];
		for(int i= 0; i<n; i++) {
			sc.nextLine();
			System.out.printf("Digite o nome do hospede numero %d \n", cont);
			String nome = sc.nextLine();
			System.out.println("digite seu email");
			String email = sc.nextLine();
			System.out.println("qual quarto ?");
			int quarto = sc.nextInt();	
			aluga[quarto] = aluga[i]; 
			aluga[i] = new Aluga(nome, email, quarto);
			cont++;
			
		}
		
		System.out.println(aluga.toString());
		
		sc.close();
		
	}

}
