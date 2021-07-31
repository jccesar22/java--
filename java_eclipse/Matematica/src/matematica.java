
public class matematica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		System.out.println("Modelo de apresentação numero 1");
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x +" = " + A);
		System.out.println("Raiz quadrada de " + y +" = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		System.out.println("Modelo de apresentação numero 2 numeros elevado a potencia");
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a  " + y +" = "+ A);
		System.out.println(x + " elevado " + y +" = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		System.out.println("Modelo de apresentação numero 3 valor absoluto");
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y +" = " + A);
		System.out.println("Valor absoluto de " + z +" = " + B);

	}

}
