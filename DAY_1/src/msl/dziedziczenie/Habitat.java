package msl.dziedziczenie;

public class Habitat {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
			Animal human1=new Human(80.5,1.9,"Czeslaw");
			Shark shark= new Shark(300,5,"Rekin Ludojad",20);
			Animal shaggy= new Shark(10,0.2,"rekin lilipuci",1);			
			Human otherHuman=(Human)human1;
			otherHuman.huntIt(shark);
			otherHuman.huntIt(human1);
			otherHuman.rozmnazaj();
			Human yetAnotherHuman=(Human)otherHuman.clone();
			otherHuman.setName("Janosik");						
			human1.printOffspr();
			otherHuman.printOffspr();			
			yetAnotherHuman.printOffspr();
			yetAnotherHuman.huntIt(shaggy);
			otherHuman.showTrophies();
			yetAnotherHuman.showTrophies();
			yetAnotherHuman.printOffspr();
			
		/*	human1.rozmnazaj();
			human1.printOffspr();
			Shark shark= new Shark(300,5,"Rekin Ludojad",20);
			Animal shaggy= new Shark(10,0.2,"rekin lilipuci",1);
			shark.isBigger(human1);
			shark.isAnimalEatable(human1);
			shark.eat(human1);
			shark.eat(shaggy);*/
	}
}
