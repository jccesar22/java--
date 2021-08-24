package cadastro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produto extends CadastroProduto {
	static Scanner teclado = new Scanner(System.in);
	public String consulta;
	public static String opcao;

	public String getConsulta() {
		return consulta;
	}
	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}

//tela. 1.1
	public static void menuTela1() {
		int op = 0;

		do {
			System.out.println("****************************TELA 1.1****************************************");
			System.out.println("1 - INCLUSÃO\r\n" + "2 - ALTERAÇÃO\r\n" + "3 - CONSULTA\r\n" + "4 - EXCLUSÃO\r\n"
					+ "0 - RETORNAR\r\n" + "OPÇÃO: _");
			op = teclado.nextInt();
			switch (op) {
			case 1:
				System.out.println("telas 1.1.1");
				inserirProduto();
				System.out.print("repetir criacao de um novo produto(S/N)? :");
				String opcao = teclado.nextLine();
				if (opcao.equals("s")) {
					inserirProduto();		
					} else {
					System.out.println("Finalizando cadastro");
			}
				break;
			case 2:
				System.out.println("telas 1.1.2");
				alteracao();
				System.out.print("repetir alteração de um novo produto(S/N)? :");
				String opcao2 = teclado.nextLine();
				if (opcao2.equals("s")) {
					alteracao();
				} else {
					System.out.println("Finalizando alteracao");
			}
				break;
			case 3:
				System.out.println("telas 1.1.3");
				consultar();
				System.out.print("repetir consulta de um novo produto(S/N)? :");
				String opcao3 = teclado.nextLine();
				if (opcao3.equals("s")) {
					alteracao();
				} else {
					System.out.println("Finalizando consulta");
			}
				break;
			case 4:
				System.out.println("telas 1.1.4");
				exclusao();
				System.out.print("repetir exclusao de um novo produto(S/N)? :");
				String opcao4 = teclado.nextLine();
				if (opcao4.equals("s")) {
					alteracao();
				} else {
					System.out.println("Finalizando exclusao");
			}
				default:
					System.out.println("Digite uma opcao valida");
				break;
			}

		} while (op != 0);

	}

	protected static List<CadastroProduto> cadastro = new ArrayList<>();

///adiconando produtos
	public static void inserirProduto() {
		System.out.println("*****************************TELA DE CADASTRO **********************************");
		System.out.println("EMPRESA DE IMPORTAÇÃO DE PRODUTOS LTDA.\r\n" + "SISTEMA DE CONTROLE DE ESTOQUE\r\n"
				+ "INCLUSÃO DE PRODUTO\n\n");
		ValidacaoProduto();

	}

///metodo de alteracao >>>>>>>>>>>>não esta funcionando
	public static void alteracao() {
		boolean achou = false;
		System.out.println("*****************************_TELA DE ALTERACAO_**********************************");
		System.out.println("EMPRESA DE IMPORTAÇÃO DE PRODUTOS LTDA.\r\n" + "SISTEMA DE CONTROLE DE ESTOQUE\r\n"
				+ "ALTERAÇÃO DE PRODUTO");
		System.out.println("digite o nome do produto:");
		teclado.nextLine();
		String consulta = teclado.nextLine();

		for (int i = 0; i < cadastro.size(); i++) {
			if (cadastro.get(i).getNome().contains(consulta)) {
				System.out.println("digite novo preco");
				double preco = teclado.nextDouble();
				while (preco < 0) {
					System.out.println("Preco abaixo do permitido");
					System.out.println("Preco unitario");

				}
				System.out.println("Unidade de medida");
				teclado.nextLine();
				String unidade = teclado.nextLine();
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
					cadastro.get(i).setPreco(preco);
					cadastro.get(i).setUnidade(unidade);
					cadastro.get(i).setEstoque(estoque);
					System.out.println("Produto alterado com sucesso");
				} else {
					System.out.println("produto nao pode ser cadastrado");
					achou = true;
				}

			}

		}
		if (achou != true) {
			System.out.println("Produto não cadastrado");
		}
	}

//metodo para poder consultatr
	protected static void consultar() {
		System.out.println("*****************************_TELA DE CONSULTAR_**********************************");
		System.out.println("EMPRESA DE IMPORTAÇÃO DE PRODUTOS LTDA.\r\n" + "SISTEMA DE CONTROLE DE ESTOQUE\r\n"
				+ "CONSULTA DE PRODUTO");
		System.out.println("digite o nome do produto:");
		teclado.nextLine();
		String consulta = teclado.nextLine();
		boolean achou = false;
		for (int i = 0; i < cadastro.size(); i++) {
			if (cadastro.get(i).getNome().contains(consulta)) {
				System.out.println("Produto \nNome: " + cadastro.get(i).getNome() + "\nPreco unitaria: "
						+ cadastro.get(i).getPreco() + "\nUnidade de medida: " + cadastro.get(i).getUnidade()
						+ "\nquantidade de estoque: " + cadastro.get(i).getEstoque());
			}
			achou = true;
		}
		if (!achou) {
			System.out.println("Produto não cadastrado");
		}
	}

//metodo para excluir , ele deleta apartir do inicial
	public static void exclusao() {
		System.out.println(
				"*****************************_TELA DE EXCLUSAO DE PRODUTO_**********************************");

		System.out.println("EMPRESA DE IMPORTAÇÃO DE PRODUTOS LTDA.\r\n" + "SISTEMA DE CONTROLE DE ESTOQUE\r\n"
				+ "EXCLUSÃO DE PRODUTO");
		System.out.println("digite o nome do produto:");
		teclado.nextLine();
		String consulta = teclado.nextLine();
		boolean achou = false;
		for (int i = 0; i < cadastro.size(); i++) {
			if (cadastro.get(i).getNome().contains(consulta)) {
				System.out.println("CONFIRMA EXCLUSÃO (S/N)?");
				String op = teclado.nextLine();
				if (op == "s") {
					cadastro.remove(i).getNome();

				}
				achou = true;
			}
			if (!achou) {
				System.out.println("Produto não cadastrado");
			}

		}
	}

	/// validação do nome de cadastro junto com a validação de quantidade e valo
	public static void ValidacaoProduto() {
		teclado.nextLine();
		System.out.println("Nome do produto");
		String nome = teclado.nextLine().toLowerCase();
		boolean achou = false;
			for (int i = 0; i < cadastro.size(); i++) {
				if (cadastro.get(i).getNome().equals(nome)) {/// cadastro.get(i).getNome().contains(nome)
					System.out.println("Produto ja cadastrado");
					achou = true;
				}
			}
		if (achou != true) {
			System.out.println("Preco unitario");
			double preco = teclado.nextDouble();
			while (preco < 0) {
				System.out.println("Preco abaixo do permitido");
				System.out.println("Preco unitario");
				preco = teclado.nextDouble();
			}
			System.out.println("Unidade de medida");
			teclado.nextLine();
			String unidade = teclado.nextLine();
			System.out.println("quantidade de estoque");
			int estoque = teclado.nextInt();
			while (estoque <= 0) {		
				System.out.println("Preco abaixo do permitido");
				System.out.println("quantidade de estoque");
				estoque = teclado.nextInt();
			}
			System.out.print("CONFIRMA INCLUS�O (S/N)? :");
			teclado.nextLine();
			String opcao = teclado.nextLine().toLowerCase();
			if (opcao.equals("s")) {
				cadastro.add(new CadastroProduto(nome, preco, unidade, estoque));
				System.out.println("Produto cadastrado com sucesso");
			} else {
				System.out.println("produto nao pode ser cadastrado");

			}
		}
	}

}
