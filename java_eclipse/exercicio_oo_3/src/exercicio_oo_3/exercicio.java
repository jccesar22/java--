package exercicio_oo_3;

import java.util.Locale;
import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		entities aluno = new entities();
		System.out.print("nome do aluno: ");
		aluno.nome = sc.nextLine();
		System.out.println("PRIMEIRA NOTA");
		aluno.grade1 = sc.nextDouble();
		System.out.println("SEGUNDA NOTA");
		aluno.grade2 = sc.nextDouble();
		System.out.println("TERCEIRA NOTA");
		aluno.grade3 = sc.nextDouble();
		System.out.printf("final grade: %.2f \n" , aluno.soma());
		if(aluno.soma() < 60.00) {
			System.out.println("failed");
			System.out.printf("MISSING %.2f POINTS%n", aluno.missingPoints());
		}
		else {
			System.out.println("pass");
		}
		sc.close();
}

}
