package appcation;


public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public Product(String nome, double price, int quantity) {
		this.name = nome;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return name
				+", $"
				+ String.format("%.2f",price)
				+", "
				+ quantity
				+" units, total: $"
				+ String.format("%.2f", totalValueInStock());
		
	}
}
