package maiorNumero;

import java.util.Scanner;

public class numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("primeira");
		a = sc.nextInt();
		System.out.println("segunda");
		b = sc.nextInt();
		System.out.println("terceira");
		c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		System.out.println(higher);
		
		sc.close();
	}

	
	public static int max(int x,int y, int z) {
		int maior;
		if (x > y && x > z) {
			maior = x;
		}
		else if(y > z){
			maior = y;
		}
		else {
			maior = z;
		}
		System.out.println(maior);
		return maior;
		
	}
	
	public static void showResult(int value) {
		System.out.println("higher = "+ value);
	}
	
}
