package calculoMinuto;

import java.util.Locale;
import java.util.Scanner;

public class minuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*calculando minutos de uso de ligação até 100 miinutos e 50 reais acima e 2 reais por nimutos*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("a sua conta custara R$%.2f", conta);
		sc.close();

	}

}
