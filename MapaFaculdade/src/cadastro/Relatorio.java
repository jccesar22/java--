package cadastro;

public class Relatorio extends Produto {

	public Relatorio() {
		
	}
	public Relatorio(String nome, double preco, String unidade, int estoque) {
		this.nome = nome;
		this.preco = preco;
		this.unidade = unidade;
		this.estoque = estoque;
	}

	// relatorio da lista de produtos cadastrado
	public static void relatorio() {
		int cont = 1;
		if (cadastro.size() == 0) {
			System.out.println("Lista vasia, cadastre novos produtos");
		} else {System.out.println("Realatorios de produtos cadastrados");
			for (CadastroProduto cons : cadastro) {
				System.out.println("*************************************************************************");
				System.out.printf("Produto " + cont + "\nNome: " + cons.getNome() + "\nPreco unitaria: %.2f"
						 +"\nUnidade de medida: " + cons.getUnidade() + "\nquantidade de estoque: "
						+ cons.getEstoque(), cons.getPreco());
				System.out.println();
				cont++;

			}
		}
	}
}
