package exercicio_while_3;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
exemplo.*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tipo de combustivbel\n 1.Álcool\n 2.Gasolina\n 3.Diesel\n 4.Fim\n opção:");
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
