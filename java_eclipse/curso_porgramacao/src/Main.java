import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 32;
		double x = 10.458655550;
		String nome = "maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("Bom dia!");
		System.out.println("resultado " + x + "metros");
		System.out.printf("resultado  %.2f metros\n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais", nome, idade, renda);
		
		
		
	}

}
