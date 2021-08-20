package cadastro;

public class CadastroProduto {

	protected  String nome;
	protected double preco;
	protected String unidade;
	protected int estoque = 0;
	protected char inserir;
    
	
	protected  String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public double getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public char getInserir() {
		return inserir;
	}
	public void setInserir(char inserir) {
		this.inserir = inserir;
	}
	public CadastroProduto(String nome, double preco, String unidade, int estoque) {
		this.nome = nome;
		this.preco = preco;
		this.unidade = unidade;
		this.estoque = estoque;
	}
	public CadastroProduto() {

	}
	
	
    
}
