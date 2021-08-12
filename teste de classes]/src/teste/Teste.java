package teste;

import java.util.Locale;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		  CaixaEletronico caixa = new CaixaEletronico();
		           caixa.depositar(150);
		           caixa.depositar (250);
		           caixa.sacar(300);
		           caixa.sacar(100);
		           caixa.sacar(-100);
		           System.out.println(caixa);

	}

}

