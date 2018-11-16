package msl.dziedziczenie;

public class Shark extends Fish {
	void eat(Animal toBeEaten) {
		 if (isAnimalEatable(toBeEaten)) System.out.printf("Animal %s eaten by shark\n",toBeEaten.name);
		 else System.out.printf("B³eeee animal %s is awfull!",toBeEaten.name);
	}
	boolean isAnimalEatable(Animal animal) {
		if (animal instanceof Human) {
			return true;
		}
		else {return false;}
	}
	public Shark(double weight, double sizeInM, String name, double diveLngth) {
		super(weight, sizeInM, name, diveLngth);
	}

}
