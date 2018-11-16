package msl.polimorf.store;
import java.text.DateFormat;
import java.util.Date;

public class Food extends Product {
	public static final String [] AVAIL_PRODS;
	static {
		AVAIL_PRODS=new String [4];
		AVAIL_PRODS[0]="Bread";
		AVAIL_PRODS[1]="Milk";
		AVAIL_PRODS[2]="Ham";
		AVAIL_PRODS[2]="Butter";	
	}
	
	static {
		try {}
		catch(Exception e ) {
			
		}		
	}
	static  double _vat_=0.1;
	private double discount=0;
	private Date termOfUse;	
	public Food(String name, double price, String termofUse) {
		super(name, _vat_, price);
		
	}
	@Override
	public double getPrice() {
		double basePrice=price+price*vat;
		return basePrice -(basePrice*discount);		
	}
	

}
