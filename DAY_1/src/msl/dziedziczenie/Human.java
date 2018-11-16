package msl.dziedziczenie;

import java.util.ArrayList;
import java.util.Date;

public class Human extends Mammal implements Cloneable/*implements Explorable*/{
	static int _prgnLngth_=9;
	
	public void huntIt(Animal victim) {
		huntedAnimals.add(victim);
	}
	public void showTrophies() {
		System.out.printf("%s animals:%s\n",this.name,huntedAnimals.toString());			
	}
	ArrayList<Animal> huntedAnimals;
	void climb() {};
	void run() {};
	public Human(double weight, double sizeInM, String name) {
		super(weight, sizeInM, name, _prgnLngth_);
		huntedAnimals= new ArrayList<Animal>();
		// TODO Auto-generated constructor stub
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Human newHuman =(Human) super.clone();
		newHuman.setName("Nieznany");
		newHuman.offspringCntr=0;
		newHuman.huntedAnimals=new ArrayList<Animal>();
//		return new Human(this.weight,this.sizeInM,"Nieznany");
		return newHuman;
	}	
}
