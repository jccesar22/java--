package teste_java_oo;

import java.util.Locale;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		notas aluno = new notas();
		System.out.println("nome do aluno");
		aluno.nome = sc.nextLine();
		System.out.println("primeira nota");
		aluno.nota1 = sc.nextDouble();
		System.out.println("segunda nota");
		aluno.nota2 = sc.nextDouble();
		System.out.println("terceira nota");
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Nota final %.2f\n", aluno.NotaFinal());
		
		if(aluno.NotaFinal() < 60.00) {
			System.out.println("reprovado");
		}
		else {
			System.out.println("Aprovado");
		}

	}

}
