package msl.polimorf.store;

public class Product {
	protected String name;
	protected double vat;


	protected double price;
	//private double price;
	
	
	
	protected Product(String name, double vat, double price) {
		super();
		this.name = name;
		this.vat = vat;
		this.price = price;
	}
	protected Product(String name, double price) {
		super();
		this.name = name;
		
		this.price = price;
	}
	
	public double getPrice() {
		return price+price*vat;
	}	
	
	public final String getName() {
		return name;
	}
	
	public double getVat() {
		return vat;
	}
	
	public void setVat(double vat) {
		this.vat = vat;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
