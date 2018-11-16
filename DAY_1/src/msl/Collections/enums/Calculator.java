package msl.Collections.enums;

public enum Calculator {
	ADD(0.1)
	{@Override
	double perform(double a, double b) {
		// TODO Auto-generated method stub
		return Double.sum(a,b);
	}},
	MINUS(0.2){
	@Override
		double perform(double a, double b) {
			// TODO Auto-generated method stub
			return Double.sum(a,b);
		}	
	},
	MULTIPLY(0.3){
		@Override
		double perform(double a, double b) {
			// TODO Auto-generated method stub
			return (a*b)*vat;
		}
	},
	DIVIDE(0.4){
		@Override
		double perform(double a, double b) {
			// TODO Auto-generated method stub
			return 0;
		}
	};
	private double vat;
	
	private Calculator(double vat) {
		this.vat = vat;
	}

	abstract double perform(double a,double b);
}
