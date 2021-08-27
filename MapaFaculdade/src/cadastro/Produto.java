package cadastro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import console.Console;

public class Produto extends CadastroProduto {
	static Scanner teclado = new Scanner(System.in);
	public static String opcao;

	public Produto() {

	}

	public Produto(String nome, double preco, String unidade, int estoque) {
		this.nome = nome;
		this.preco = preco;
		this.unidade = unidade;
		this.estoque = estoque;
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
				String opcao = Console.read("repetir criacao de um novo produto(S/N)? :");
				if (opcao.equals("s")) {
					inserirProduto();
				} else {
					System.out.println("Finalizando cadastro");
				}
				break;
			case 2:
				System.out.println("telas 1.1.2");
				alteracao();
				String opcao2 = Console.read("repetir alteração de um novo produto(S/N)? :");
				if (opcao2.equals("s")) {
					alteracao();
				} else {
					System.out.println("Finalizando alteracao");
				}
				break;
			case 3:
				System.out.println("telas 1.1.3");
				consultar();
				String opcao3 = Console.read("repetir alteração de um novo produto(S/N)? :");
				if (opcao3.equals("s")) {
					consultar();
				} else {
					System.out.println("Finalizando consulta");
				}

				break;
			case 4:
				System.out.println("telas 1.1.4");
				exclusao();
				String opcao4 = Console.read("repetir exclusao de um novo produto(S/N)? : ");
				if (opcao4.equals("s")) {
					exclusao();
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
		String consulta = Console.read("digite o nome do produto: ");
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
		boolean achou = false;
		System.out.println("*****************************_TELA DE CONSULTAR_**********************************");
		System.out.println("EMPRESA DE IMPORTAÇÃO DE PRODUTOS LTDA.\r\n" + "SISTEMA DE CONTROLE DE ESTOQUE\r\n"
				+ "CONSULTA DE PRODUTO");
		String consulta = Console.read("digite o nome do produto: ");

		for (int i = 0; i < cadastro.size(); i++) {
			if (cadastro.get(i).getNome().contains(consulta)) {
				System.out.println("Produto \nNome: " + cadastro.get(i).getNome() + "\nPreco unitaria: "
						+ cadastro.get(i).getPreco() + "\nUnidade de medida: " + cadastro.get(i).getUnidade()
						+ "\nquantidade de estoque: " + cadastro.get(i).getEstoque());
				achou = true;
			}

		}

		if (achou != true) {
			System.out.println("Produto não cadastrado");
		}
	}

//metodo para excluir , ele deleta apartir do inicial
	public static void exclusao() {
		boolean achou = false;
		System.out.println(
				"*****************************_TELA DE EXCLUSAO DE PRODUTO_**********************************");
		System.out.println("EMPRESA DE IMPORTAÇÃO DE PRODUTOS LTDA.\r\n" + "SISTEMA DE CONTROLE DE ESTOQUE\r\n"
				+ "EXCLUSÃO DE PRODUTO");
		String consulta = Console.read("digite o nome do produto: ");
		for (int i = 0; i < cadastro.size(); i++) {
			if (cadastro.get(i).getNome().contains(consulta)) {
				String op = Console.read("CONFIRMA EXCLUSÃO (S/N)? ");
				if (op.equals("s")) {
					cadastro.remove(i).getNome();
					System.out.println("Produto deletado");
				}

			}
			achou = true;
		}
		if (!achou) {
			System.out.println("bosdta");
		}
	}

	/// validação do nome de cadastro junto com a validação de quantidade e valo
	public static void ValidacaoProduto() {
		boolean achou = false;
		String nome = Console.read("Nome do produto ");
		for (int i = 0; i < cadastro.size(); i++) {
			if (cadastro.get(i).getNome().equals(nome)) {
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
			String opcao = Console.read("CONFIRMA INCLUSAO (S/N)? :");
			if (opcao.equals("s")) {
				cadastro.add(new CadastroProduto(nome, preco, unidade, estoque));
				System.out.println("Produto cadastrado com sucesso");
			} else {
				System.out.println("produto nao pode ser cadastrado");

			}
		}
	}

}
