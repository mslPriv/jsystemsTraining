package msl.Collections.enums;

import msl.polimorf.store.Product;

public class Market {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product prd=new Product("Food",1000.0);
		System.out.println(VatCalculator.FOOD.calcVat2(prd.getPrice()));
	}
}
