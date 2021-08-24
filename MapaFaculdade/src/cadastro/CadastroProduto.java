package cadastro;

public class CadastroProduto {

	public String nome;
	public  double preco;
	public String unidade;
	public int estoque = 0;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public CadastroProduto() {
		
	}
	public CadastroProduto(String nome, double preco, String unidade, int estoque) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.unidade = unidade;
		this.estoque = estoque;
	}
	    
}
