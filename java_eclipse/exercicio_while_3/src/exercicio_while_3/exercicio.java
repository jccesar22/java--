package exercicio_while_3;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva 
um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel 
4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at� 
que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a 
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme 
exemplo.*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tipo de combustivbel\n 1.�lcool\n 2.Gasolina\n 3.Diesel\n 4.Fim\n op��o:");
		int cod = sc.nextInt();
		int al = 0, ga = 0, di = 0;
		while(cod != 4) {
			if (cod == 1) {
				al += 1;
			}
			else if (cod == 2) {
				ga += 1;
			}
			else if (cod == 3) {
				di += 1;
			}
			cod = sc.nextInt();
		}
		sc.close();
		System.out.printf("Ficha de resultado\nAlcool = %d \ngasolina = %d \ndisel = %d", al, ga, di);
	}

}
