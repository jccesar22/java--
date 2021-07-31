package entities;

import java.util.Date;

public class UsedProduct extends Produtct{
		private Date manufactureDate;
		
		public void UsedProduct() {
		}
		
		public UsedProduct(String nome, Double price, Date manufactureDate) {
			super(nome, price);
			this.manufactureDate = manufactureDate;
		}

		
		public Date getManufactureDate() {
			return manufactureDate;
		}

		public void setManufactureDate(Date manufactureDate) {
			this.manufactureDate = manufactureDate;
		}

		public String priceTag(Date date) {
			date = new Date();
			return null;
		}
}
