package programa;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		System.out.println("finalizou programa");

	}
	public static void method1() {
		System.out.println("****METHOD START******");
		method2();
		System.out.println("****METHOD AND******");
	}
	public static void method2() {
		System.out.println("****METHOD2 START******");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			///e.printStackTrace(); vai mostrar sobre o erro da exeção 
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("input Error");
		}
		sc.close();
		System.out.println("****METHOD2 AND******");
	}
}
