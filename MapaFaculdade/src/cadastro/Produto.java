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

	public Produto(String nome, double preco, String unidade, int estoque, String consulta) {
		super(nome, preco, unidade, estoque);
		this.consulta = consulta;
	}

	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}

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
				break;
			case 2:
				System.out.println("telas 1.1.2");
				alteracao();
				break;
			case 3:
				System.out.println("telas 1.1.3");
				consultar();
				break;
			case 4:
				System.out.println("telas 1.1.4");
				exclusao();
				break;
			}

		} while (op != 0);

	}

	static List<CadastroProduto> cadastro = new ArrayList<>();

	public static void inserirProduto() {
		System.out.println("*****************************TELA DE CADASTRO **********************************");
		System.out.println("EMPRESA DE IMPORTAÇÃO DE PRODUTOS LTDA.\r\n" + "SISTEMA DE CONTROLE DE ESTOQUE\r\n"
				+ "INCLUSÃO DE PRODUTO\n\n");
		ValidacaoProduto();
	
		

	}

	public static void alteracao() {
		System.out.println("*****************************_TELA DE ALTERACAO_**********************************");
		System.out.println("EMPRESA DE IMPORTAÇÃO DE PRODUTOS LTDA.\r\n" + "SISTEMA DE CONTROLE DE ESTOQUE\r\n"
				+ "ALTERAÇÃO DE PRODUTO");
	}

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
						+ "\nquantidade de estoque" + cadastro.get(i).getEstoque());
			}
			achou = true;
		}
		if (!achou) {
			System.out.println("Produto não cadastrado");
		}
	}

	public static void exclusao() {
		System.out.println(
				"*****************************_TELA DE EXCLUSAO DE PRODUTO_**********************************");

		System.out.println("EMPRESA DE IMPORTAÇÃO DE PRODUTOS LTDA.\r\n" + "SISTEMA DE CONTROLE DE ESTOQUE\r\n"
				+ "EXCLUSÃO DE PRODUTO");
		System.out.println("digite o nome do produto:");
		String consulta = teclado.nextLine();
		boolean achou = false;
		for (int i = 0; i < cadastro.size(); i++) {
			if (cadastro.get(i).getNome().contains(consulta))
				cadastro.remove(i);
			achou = true;
		}
		if (!achou) {
			System.out.println("Produto não encontrado");
		}

	}

	/// validação do nome de cadastro junto com a validação de quantidade e valo
	public static void ValidacaoProduto() {
		boolean achou = false;
		teclado.nextLine();
		System.out.println("Nome do produto");
		String nome = teclado.nextLine();
		
		for (int i = 0; i < cadastro.size(); i++) {
			if (cadastro.get(i).getNome().equals(nome)) {///cadastro.get(i).getNome().contains(nome)
				System.out.println("Produto ja cadastrado");
				 achou = true;
			}
			}
			///achou = false;
		if(achou != true) {
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
			while (estoque < 0) {
				System.out.println("Preco abaixo do permitido");
				System.out.println("quantidade de estoque");
				estoque = teclado.nextInt();
			}
			System.out.print("CONFIRMA INCLUS�O (S/N)? :");
			teclado.nextLine();
			String opcao = teclado.nextLine();
			if (opcao.equals("s")) {
				cadastro.add(new CadastroProduto(nome, preco, unidade, estoque));
				System.out.println("Produto cadastrado com sucesso");
			} else {
				System.out.println("produto n�o pode ser cadastrado");

			
		}}}
	//	achou = false;
	
}	
	

