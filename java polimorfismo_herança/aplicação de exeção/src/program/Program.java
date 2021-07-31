package program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("c:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} 
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Error opening file: " + e.getMessage());
		} 
		finally {
			if (sc != null){
				sc.close();
			}
			System.out.println("finally block executed");			
		}
	}

}
