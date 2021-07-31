package Vet;

import java.util.Locale;
import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0;i<n; i++) {
			System.out.printf("Digite a numero do verotor da possição %d ", i);
			vect[i] = sc.nextDouble();
		}
		double soma = 0;
		for(int i=0; i<n; i++) {
			soma +=vect[i];	
		}
		double resultado = soma /n;
		System.out.printf("%.2f", resultado);
		
		sc.close();
	}

}
