package mapaProgramacao;

import java.util.Scanner;

import cadastro.CadastroProduto;

/*
 * para cadastro de produto
1_Cadastro de Produtos: consiste nas opera��es de inclus�o, altera��o, consulta e exclus�o de um produto.
2_Movimenta��o: consiste nas opera��es de entrada e sa�da de produtos no estoque.
3_Reajuste de Pre�os: consiste em aumentar o pre�o unit�rio por percentual de um ou mais produtos do estoque.
4_Relat�rio: lista de Produtos.

observa��o
Lista de Pre�os: uma rela��o de todos os produtos do estoque, constando o pre�o de cada um deles, unidade medida e quantidade.

Nome;
Pre�o Unit�rio;
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
	                    + "2 - MOVIMENTA��O\n"
	                    + "3 - REAJUSTE DE PRE�OS\n"
	                    + "4 - RELAT�RIOS\n"
	                    + "0 - FINALIZAR\n"
	                    + "OP��O: _");
	            op = teclado.nextInt();
	            switch (op) {
	                case 1:
	                	System.out.println("opc�o 1");
	                	CadastroProduto.inserirProduto();
	                    break;
	                case 2:
	                	System.out.println("opc�o 2");
	                    break;
	                case 3:
	                	System.out.println("opc�o 3");
	                    break;
	                case 4:
	                	System.out.println("opc�o 4");
	                    break;
	                default:
	                    System.out.println("Op��o invalida digite novamente");
	                    //teste para poder dar um pausa horrivel kkkk
	                    String pausa = teclado.next();
	                    break;
	            }
	            
	        }
	        while (op != 0);
	}

}
