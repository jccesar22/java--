package produtos;

import java.util.Date;

public class UsedProduct extends Product{
	private Date manuFactureDate;
	
	
	public UsedProduct() {
		super();
	}


	public UsedProduct(String nome, Double price, Date manuFactureDate) {
		super(nome, price);
		this.manuFactureDate = manuFactureDate;
	}

	

	public Date getManuFactureDate() {
		return manuFactureDate;
	}


	public void setManuFactureDate(Date manuFactureDate) {
		this.manuFactureDate = manuFactureDate;
	}


	@Override
	public void  pricetag(double price) {
		///return price;
	}
	
}
