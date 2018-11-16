package msl.dziedziczenie;

abstract class Animal {
	double weight;
	double sizeInM;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	String name;
	int offspringCntr;
	
    boolean isBigger(Animal other) {
    	return (this.sizeInM>other.sizeInM); 
    }
    boolean isHeavier(Animal other) {
    	return (this.weight>other.weight);
    }
	abstract void rozmnazaj();
	public Animal(double weight, double sizeInM, String name) {
		super();
		this.weight = weight;
		this.sizeInM = sizeInM;
		this.name = name;
		offspringCntr=0;
	}
	
	public void printOffspr() {
		System.out.printf("Offspring counter %d \n",offspringCntr);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}	
}
