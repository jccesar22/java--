import java.util.Locale;
import java.util.Scanner;

public class cotacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		System.out.println("what is the dollar price: ");
		double dollar = sc.nextDouble();
			
		System.out.println("how manu dollars will be bought?:");
		double buy = sc.nextDouble();
			
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.reais( dollar, buy));
		
		sc.close();
	}

}
