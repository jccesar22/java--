package entities;

import entities.enums.Color;

public class Rectangle extends Shape{
	private Double Widtth;
	private Double height;
	
	public Rectangle() {
		super();
	}
	
	
	public Rectangle(Color color, Double widtth, Double height) {
		super(color);
		Widtth = widtth;
		this.height = height;
	}


	public Double getWidtth() {
		return Widtth;
	}


	public void setWidtth(Double widtth) {
		Widtth = widtth;
	}


	public Double getHeight() {
		return height;
	}


	public void setHeight(Double height) {
		this.height = height;
	}


	@Override
	public double area() {
		return Widtth * height;
	}
	
}
