package cadastro;

import java.util.Scanner;

public class CadastroProduto {

	public String nome;
    public int unitario;
    public String unidade;
    public double estoque;
    private char inserir;
    

    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getUnitario() {
		return unitario;
	}
	public void setUnitario(int unitario) {
		this.unitario = unitario;
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
	public void setEstoque(double estoque) {
		this.estoque = estoque;
	}
	public char getInserir() {
		return inserir;
	}
	public void setInserir(char inserir) {
		this.inserir = inserir;
	}
	public CadastroProduto() {
    }
    public CadastroProduto(String nome, int unitario, String unidade, double estoque) {
        this.nome = nome;
        this.unitario = unitario;
        this.unidade = unidade;
        this.estoque = estoque;
    }
    
    public static void inserir(String nome, int unitario, String unidade, double estoque) {
    	int [] vetor = null;
    	for(int i = 0; i < vetor.length; i++) {
			///vetor[i] = new teclado(System.in);
    		i++;
    	}
    }
    public static void inserirProduto() {
    	Scanner teclado = new Scanner(System.in);
    	System.out.println("Nome do produto");
    	String nome = teclado.nextLine();
    	System.out.println("quantidade inutaria");
    	int unitario = teclado.nextInt();
    	System.out.println("Unidade de medida");
    	String unidade = teclado.nextLine();
    	System.out.println("quantidade de estoque");
    	Double estoque = teclado.nextDouble();
    	inserir(nome, unitario, unidade, estoque);
    }
    
}
