package entities;

public class Products {
	public String name;
	public double price;
	public int quantity;
	
	public Products() {
		
	}
	
	public Products(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;	
	}
	
	public Products(String name, double price) {
		this.name = name;
		this.price = price;
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

