package exercicio_for_4;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo 
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			if(n2 == 0) {
				System.out.println("impossivel divis�o");
			}
			else {
				double div = (double) n1 / n2;
				System.out.printf("%.1f\n", div);
			}
			
		}
		
		sc.close();
	}

}
