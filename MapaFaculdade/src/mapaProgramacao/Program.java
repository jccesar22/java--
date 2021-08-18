package mapaProgramacao;

import java.util.Scanner;

import cadastro.CadastroProduto;

/*
 * para cadastro de produto
1_Cadastro de Produtos: consiste nas operações de inclusão, alteração, consulta e exclusão de um produto.
2_Movimentação: consiste nas operações de entrada e saída de produtos no estoque.
3_Reajuste de Preços: consiste em aumentar o preço unitário por percentual de um ou mais produtos do estoque.
4_Relatório: lista de Produtos.

observação
Lista de Preços: uma relação de todos os produtos do estoque, constando o preço de cada um deles, unidade medida e quantidade.

Nome;
Preço Unitário;
Unidade;
Quantidade em Estoque.
*/

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner teclado = new Scanner(System.in);
		  
		int op = 0 ;
	      
	        do {
	            System.out.println("**************************************MAMU**************************************");
	            System.out.println("1 - CADASTRO DE PRODUTOS\n"
	                    + "2 - MOVIMENTAÇÃO\n"
	                    + "3 - REAJUSTE DE PREÇOS\n"
	                    + "4 - RELATÓRIOS\n"
	                    + "0 - FINALIZAR\n"
	                    + "OPÇÃO: _");
	            op = teclado.nextInt();
	            switch (op) {
	                case 1:
	                	System.out.println("opcão 1");
	                	CadastroProduto.inserirProduto();
	                    break;
	                case 2:
	                	System.out.println("opcão 2");
	                    break;
	                case 3:
	                	System.out.println("opcão 3");
	                    break;
	                case 4:
	                	System.out.println("opcão 4");
	                    break;
	                default:
	                    System.out.println("Opção invalida digite novamente");
	                    //teste para poder dar um pausa horrivel kkkk
	                    String pausa = teclado.next();
	                    break;
	            }
	            
	        }
	        while (op != 0);
	}

}
