import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/
		Scanner teclado = new Scanner(System.in);
		int numero ;
		System.out.println("Digite um numero para saber se ele e negativo ou não");
		numero = teclado.nextInt();
		if (numero < 0) {
			System.out.printf("o numero %d e negativo", numero);
		}else {
			System.out.printf("o numero %d não e negativo", numero);
		}
	}

}
