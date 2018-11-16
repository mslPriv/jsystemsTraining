package msl.dziedziczenie;
import java.util.Date;
abstract class Mammal extends Animal{
	int prgnLngthInMnth;
	Date lastBirth;
	public Mammal(double weight, double sizeInM, String name, int prgnLngthInMnth) {
		super(weight, sizeInM, name);
		this.prgnLngthInMnth = prgnLngthInMnth;
		this.lastBirth = null;
	}
	@Override
	void rozmnazaj() {
		lastBirth=new Date();
		offspringCntr+=1;
	}
}
