package oopsday1.setget;

public class Car {
	
	// capture properties, data members, instant variables
	
//	private String color;
	@Override
	public String toString() {
		return "I am" + brand;
	}
	
	//[color=" + color + ", price=" + price + ", brand=" + brand + ", model=" + model + "]
//	String color, double price, String brand, String model
	
	public Car() {
		super();
		this.color = color;
		this.price = price;
		this.brand = brand;
		this.model = model;
	}
	private double price;
	private String brand;
	private String model;
	private String color;
//	public String getColor() {
//		return color;
//	}
	public void setColor(String color) {
//		return color = color;
		this.color = color;
	}
	public double getPrice() {
		return price;
//		return color = color;
	}
	public void setPrice(double price) {
		this.price = price;
//		return color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public char[] getColor() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	


}
