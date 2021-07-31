package swchtcase;

import java.util.Scanner;

public class swchtcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int op ;
		op = teclado.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("segunda");
		break;
		case 2:
			System.out.println("terça");
		break;
		case 3:
			System.out.println("quarta");
		break;
		case 4:
			System.out.println("quinta");
		break;
		case 5:
			System.out.println("sexta");
		break;
		case 6:
			System.out.println("sabado");
		break;
		case 7:
			System.out.println("domingo");
		break;
		default:
			System.out.println("opção invalida");
		break;	
		}
	}

}
