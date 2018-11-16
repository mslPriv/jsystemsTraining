package msl.polimorf;

import java.io.File;

import msl.polimorf.store.Food;
import msl.polimorf.store.Product;
import msl.polimorf.store.Service;

public class Market {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buildMrkt();
		
//		for (int i=0;i<basket.length;i++) {
//			Product prdct=basket[i];
//			System.out.printf("product: price:",prdct.getName(),prdct.getPrice());
//		}
//		for(Product prdct :basket) {
//			System.out.printf("product:%s price:%f\n",prdct.getName(),prdct.getPrice());			
//		}
		
	}

	private static void buildMrkt() {
		Basket  basket=new Basket();
		basket.addProduct(new Food("Bread", 20, "20181114"));		
		basket.addProduct(new Food("Orange", 20, "20191114"));
		basket.addProduct(new Service("Tatooing snake",20,10));
		//basket.serializeBasket();
		basket.printLeaf();
		basket.poorDeSerialize();
		basket.printLeaf();		
	}
}
