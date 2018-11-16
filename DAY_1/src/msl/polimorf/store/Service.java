package msl.polimorf.store;

public class Service extends Product {
	static double _vat_=0.22;
	private int	   timeOfWork;
	public Service(String name, double price,int timeOfWork) {
		super(name, _vat_, price);
		// TODO Auto-generated constructor stub
		this.timeOfWork=timeOfWork;
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub	
		double basePrice=price*timeOfWork;
		return basePrice+basePrice*vat;
	}
}
