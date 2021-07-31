package entities;

public class Produtct {
	private String nome;
	private Double price;
	
	public void Product() {
		
	}

	public Produtct(String nome, Double price) {
		this.nome = nome;
		this.price = price;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	public String priceTag() {
		return nome;
			
	}
}
