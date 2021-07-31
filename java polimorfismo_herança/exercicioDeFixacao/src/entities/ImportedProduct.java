package entities;

public class ImportedProduct extends Produtct{
	private Double custonsFee;
	
	public void ImportedProduct() {
		
	}

	public ImportedProduct(String nome, Double price, Double custonsFee) {
		super(nome, price);
		this.custonsFee = custonsFee;
	}

	public Double getCustonsFee() {
		return custonsFee;
	}

	public void setCustonsFee(Double custonsFee) {
		this.custonsFee = custonsFee;
	}
	@Override
	public String priceTag() {
		return null;
		
	}
	
}
