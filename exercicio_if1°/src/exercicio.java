import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.*/
		Scanner teclado = new Scanner(System.in);
		int numero ;
		System.out.println("Digite um numero para saber se ele e negativo ou n�o");
		numero = teclado.nextInt();
		if (numero < 0) {
			System.out.printf("o numero %d e negativo", numero);
		}else {
			System.out.printf("o numero %d n�o e negativo", numero);
		}
	}

}
