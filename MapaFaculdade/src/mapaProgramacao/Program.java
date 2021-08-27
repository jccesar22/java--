package mapaProgramacao;



import java.util.Scanner;
import cadastro.Produto;
import cadastro.Relatorio;
import edicaoPreco.EdicaoPreco;
import movimentoDeEstoque.MovimentoEntrada;


public class Program {

	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		Scanner teclado1 = new Scanner(System.in);
		 int op = 0;
		do {
			System.out.println("**************************************MAMU**************************************");
			System.out.println("1 - CADASTRO DE PRODUTOS\n" + "2 - MOVIMENTAÇÃO\n" + "3 - REAJUSTE DE PREÇOS\n"
					+ "4 - RELATÓRIOS\n" + "0 - FINALIZAR\n" + "OPÇÃO: _");
			 op = teclado1.nextInt();
			switch (op) {
			case 1:
				System.out.println("opcão 1");
				Produto.menuTela1();
				break;
			case 2:
				System.out.println("opcão 2");
				MovimentoEntrada.menuTela2();
				break;
			case 3:
				System.out.println("opcão 3");
				EdicaoPreco.edicaoPsitivo();
				break;
			case 4:
				System.out.println("opcão 4");
				Relatorio.relatorio();
				break;
			case 0:
				System.out.println("Finalizando o sistema..............100%");
				break;
			default:
				System.out.println("Digite uma opcao valida");
			break;
			}

		}
		while (op != 0); 
		System.out.println("Sistema finalizado");
	}

	
}
