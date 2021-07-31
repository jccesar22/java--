package exercicio_if4;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o 
		 * mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
		Scanner teclado = new Scanner(System.in);
		int hora, inicio, saida ;
		System.out.println("horas do jogo");
		hora = teclado.nextInt();
		System.out.println("dia do jogo");
		inicio = teclado.nextInt();
		if (inicio > hora) {
			saida = inicio- hora;
			System.out.println(saida);
		}else {
			
			saida = 24 - hora + inicio;
			System.out.println(saida);

		}
		}

}
