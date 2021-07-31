package produtos;

public class ImpoortedProduct extends Product {
	private Double CustomsFee;

	public ImpoortedProduct() {
		super();
	}

	public ImpoortedProduct(String nome, Double price, Double customsFee) {
		super(nome, price);
		CustomsFee = customsFee;
	}

	public Double getCustomsFee() {
		return CustomsFee;
	}

	public void setCustomsFee(Double customsFee) {
		CustomsFee = customsFee;
	}
	

	
	
}
