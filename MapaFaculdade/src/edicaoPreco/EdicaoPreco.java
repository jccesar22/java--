package edicaoPreco;

import java.util.Scanner;

import cadastro.Produto;
import console.Console;

public class EdicaoPreco  extends Produto{
	
	static Scanner teclado = new Scanner(System.in);
	public static void edicaoPsitivo() {
		boolean achou = false;
		System.out.println("*****************************_TELA DE ENTRADA DE ESTOQUE**********************************");
		System.out.println("EMPRESA DE IMPORTAÇÃO DE PRODUTOS LTDA.\r\n"
				+ "SISTEMA DE CONTROLE DE ESTOQUE\r\n"
				+ "ALTERACAO DE PRECO");
		String consulta = Console.read("digite o nome do produto: ");
		for (int i = 0; i < cadastro.size(); i++) {
			if (cadastro.get(i).getNome().contains(consulta)) {
				System.out.println("O produto: "+ cadastro.get(i).getNome());
				System.out.println("O preco atual e de: "+ cadastro.get(i).getPreco());
				System.out.println("Qual o novo valor a ser adicionado?:" );
				double preco = teclado.nextDouble();
				while (preco <= 0) {
					System.out.println("Preco abaixo do permitido");
					System.out.println("quantidade de estoque");
					preco = teclado.nextDouble();
				}
				System.out.print("CONFIRMA INCLUS�O (S/N)? :");
				teclado.nextLine();
				String opcao = teclado.nextLine();
				if (opcao.equals("s")) {
					cadastro.get(i).setPreco(preco);
					cadastro.get(i).getPreco();
				}else {
					System.out.println("Entrada de estoque nao realizada");				
				}				
			}achou = true;
		}
		if (!achou) {
			System.out.println("Produto não cadastrado");
		}
}
}
