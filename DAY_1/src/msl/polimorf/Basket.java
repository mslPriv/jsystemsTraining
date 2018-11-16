package msl.polimorf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import jdk.jfr.events.FileWriteEvent;
import msl.polimorf.store.Food;
import msl.polimorf.store.Product;

public class Basket {
	ArrayList<Product> products;
	final String BASEDIR = "D:/PLIKI/BASKET";

	public Basket() {
		// TODO Auto-generated constructor stub
		products = new ArrayList<Product>();
	}

	void addProduct(Product prdct) {
		if (prdct instanceof Food) {
			System.out.println("In shop:" + Arrays.asList(Food.AVAIL_PRODS).contains(prdct.getName()));
		}
		products.add(prdct);

	}

	private void flushPrdValues() {
		for (Product prd : products) {
			prdToFl(prd);
		}
	}

	public void serializeBasket() {
		buildStrct();
		flushPrdValues();
	}
	public void poorDeSerialize() {
		for (Product prd : products) {
			readProductFromFl(prd);;
		}		
	}
	

	private void prdToFl(Product prd) {
		try (PrintWriter budd = new PrintWriter(
				new FileWriter(new File(BASEDIR + "/" + prd.getClass().getName() + "/" + prd.getName())));) {
			//budd.printf("Name:%s, Price:%s, Vat:%s", prd.getName(), prd.getPrice(), prd.getVat());
			budd.println("price:" + prd.getPrice());
			budd.println("vat:" + prd.getVat());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void buildStrct() {
		for (Product prdct : products) {

			File dir = new File(BASEDIR + "/" + prdct.getClass().getName());
			if (dir.exists()) {
				for (File fl : dir.listFiles()) {
					fl.delete();
				}
			}
			dir.mkdirs();

			File fl = new File(dir.getAbsolutePath() + "/" + prdct.getName());
			try {
				if (!fl.exists()) {
					fl.createNewFile();
				}
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}

		}

	}

	void readProductFromFl(Product prd){
		try(BufferedReader reader=new BufferedReader(new FileReader(BASEDIR+"/"+prd.getClass().getName()+"/"+prd.getName()))){
			String prdFlVal="";
			while((prdFlVal=reader.readLine()) !=null) {
				String[] flVals=prdFlVal.split(":");
				if("price".equals(flVals[0])){
					prd.setPrice(Double.parseDouble(flVals[1]));
				};
				if("vat".equals(flVals[0])){
					prd.setVat(Double.parseDouble(flVals[1]));
				}
			}
		}
		catch (IOException e ) {
			e.printStackTrace();
		}
	}

	void printLeaf() {
		double prd_sum = 0;

		for (Product prdct : products) {
			System.out.printf("product:%s vat:%f price:%f\n", prdct.getName(), prdct.getVat(), prdct.getPrice());
			prd_sum += prdct.getPrice();
		}
		System.out.printf("IN TOTAL:%f\n", prd_sum);
	}

}
