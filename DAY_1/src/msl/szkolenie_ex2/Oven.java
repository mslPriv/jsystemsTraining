package msl.szkolenie_ex2;

public class Oven implements Bakeable,Grillable {
	int temp;
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	@Override
	public void grillIt(String product, int temp) {
		// TODO Auto-generated method stub
		if (Grillable.maxTemp<temp){
			System.out.println("Don't try to overheat me- max grill temp is"+Grillable.maxTemp);
			return;
		}
		setTemp(temp);
		System.out.printf("Grilling %s %d",product,temp);
	}
	@Override
	public void bakeIt(String product, int temp) {
		// TODO Auto-generated method stub
		if (Bakeable.maxTemp<temp){
			System.out.println("Don't try to overheat me-max baking temp is"+Bakeable.maxTemp);
			return;
		}
		setTemp(temp);
		System.out.printf("Baking %s at temperature %d",product,temp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oven myOven=new Oven();
		myOven.bakeIt("Chicken", 1000);
		myOven.grillIt("Chicken", 1000);
		
		Bakeable baker=myOven;
	}
}

