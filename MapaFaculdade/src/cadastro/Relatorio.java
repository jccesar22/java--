package cadastro;

public class Relatorio extends Produto {

	// relatorio da lista de produtos cadastrado
	public static void relatorio() {
		int cont = 1;
		if (cadastro.size() == 0) {
			System.out.println("Lista vasia, cadastre novos produtos");
		} else {System.out.println("Realatorios de produtos cadastrados");
			for (CadastroProduto cons : cadastro) {
				System.out.println("*************************************************************************");
				System.out.println("Produto " + cont + "\nNome: " + cons.getNome() + "\nPreco unitaria: "
						+ cons.getPreco() + "\nUnidade de medida: " + cons.getUnidade() + "\nquantidade de estoque"
						+ cons.getEstoque());
				System.out.println();
				cont++;

			}
		}
	}
}
