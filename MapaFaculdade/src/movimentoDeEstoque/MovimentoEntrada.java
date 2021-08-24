package movimentoDeEstoque;

import java.util.Scanner;

import cadastro.Produto;

public class MovimentoEntrada extends Produto{
	static Scanner teclado = new Scanner(System.in);
	public int qteEntrada;
	static int op = 0;
	
	///menu 1.2
	public static void menuTela2() {
		do {
		System.out.println("**************************************MAMU_1.2**************************************");
		System.out.println("EMPRESA DE IMPORTAÇÃO DE PRODUTOS LTDA.\r\n"
				+ "SISTEMA DE CONTROLE DE ESTOQUE\r\n"
				+ "MOVIMENTAÇÃO\r\n"
				+ "1 - ENTRADA\r\n"
				+ "2 - SAÍDA\r\n"
				+ "0 - RETORNAR\r\n"
				+ "OPÇÃO: _");
		op = teclado.nextInt();
		switch (op) {
		case 1:
			System.out.println("op1");
			entradaQtd();
			teclado.nextLine();
			System.out.print("repetir alteração de um novo produto(S/N)? :");
			String opcao1 = teclado.nextLine();
			
			while (opcao1 != "n") {
				entradaQtd();
			}
			System.out.println("finalizando a entrada");
			break;
		case 2:
			System.out.println("op2");
			saidaQtd();
			System.out.print("repetir alteração de um novo produto(S/N)? :");
			String opcao2 = teclado.nextLine();
			if (opcao2.equals("s")) {
				saidaQtd();
			} else {
				System.out.println("Finalizando alteracao");
		}
			break;
		default:
			System.out.println("Digite uma opcao valida");
		break;
		}
		}while (op != 0);
	}
	
	public static void entradaQtd() {
		boolean achou = false;
		System.out.println("*****************************_TELA DE ENTRADA DE ESTOQUE**********************************");
		System.out.println("EMPRESA DE IMPORTAÇÃO DE PRODUTOS LTDA.\r\n"
				+ "SISTEMA DE CONTROLE DE ESTOQUE\r\n"
				+ "MOVIMENTAÇÃO - ENTRADA DE PRODUTO");
		System.out.println("digite o nome do produto:");
		String consulta = teclado.nextLine();
		teclado.nextLine();
		for (int i = 0; i < cadastro.size(); i++) {
			if (cadastro.get(i).getNome().contains(consulta)) {
				System.out.println("O produto: "+ cadastro.get(i).getNome());
				System.out.println("A quantidade atual e de: "+ cadastro.get(i).getEstoque());
				System.out.println("Qual e a quantidade desejada para entrada de estoque?:" );
				System.out.println("quantidade de estoque");
				int estoque = teclado.nextInt();
				while (estoque <= 0) {
					System.out.println("Preco abaixo do permitido");
					System.out.println("quantidade de estoque");
					estoque = teclado.nextInt();
				}
				System.out.print("CONFIRMA INCLUS�O (S/N)? :");
				teclado.nextLine();
				String opcao = teclado.nextLine();
				if (opcao.equals("s")) {
					 cadastro.get(i).setEstoque(estoque + cadastro.get(i).getEstoque());
					cadastro.get(i).getEstoque();
				}else {
					System.out.println("Entrada de estoque nao realizada");
				}
				
				
			}
		}if (!achou) {
			System.out.println("Produto não cadastrado");
		}

	}
	
	public static void saidaQtd() {
		boolean achou = false;
		System.out.println("*****************************_TELA DE SAIDA DE ESTOQUE**********************************");
		System.out.println("EMPRESA DE IMPORTAÇÃO DE PRODUTOS LTDA.\r\n"
				+ "SISTEMA DE CONTROLE DE ESTOQUE\r\n"
				+ "MOVIMENTAÇÃO - SAIDA DE PRODUTO");
		System.out.println("digite o nome do produto:");
		String consulta = teclado.nextLine();
		teclado.nextLine();
		for (int i = 0; i < cadastro.size(); i++) {
			if (cadastro.get(i).getNome().contains(consulta)) {
				System.out.println("O produto: "+ cadastro.get(i).getNome());
				System.out.println("A quantidade atual e de: "+ cadastro.get(i).getEstoque());
				System.out.println("Qual e a quantidade desejada para entrada de estoque?:" );
				System.out.println("quantidade de estoque");
				int estoque = teclado.nextInt();
				while (estoque <= 0) {
					System.out.println("Preco abaixo do permitido");
					System.out.println("quantidade de estoque");
					estoque = teclado.nextInt();
				}
				System.out.print("CONFIRMA INCLUS�O (S/N)? :");
				teclado.nextLine();
				String opcao = teclado.nextLine();
				if (opcao.equals("s")) {
					 cadastro.get(i).setEstoque(estoque - cadastro.get(i).getEstoque());
					cadastro.get(i).getEstoque();
				}else {
					System.out.println("Entrada de estoque nao realizada");
				}
				
				
			}
		}if (!achou) {
			System.out.println("Produto não cadastrado");
		}
	
}}