package msl.dziedziczenie;

abstract public class Fish extends Animal{
	double diveLngth;

	public Fish(double weight, double sizeInM, String name, double diveLngth) {
		super(weight, sizeInM, name);
		this.diveLngth = diveLngth;
	}
	void rozmnazaj() {
		offspringCntr+=10;
	}
	
}
