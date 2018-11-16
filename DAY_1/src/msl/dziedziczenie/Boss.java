package msl.dziedziczenie;

public class Boss extends Pracownik{
	private double premia;
	public double getPremia() {
		return premia;
	}
	public Boss(String id, double zarobki) {
		super(id, zarobki);
		// TODO Auto-generated constructor stub
	}
	public Boss(String id, double zarobki, double premia) {
		this(id, zarobki);
		this.premia=premia;
	}
	
	@Override
	public double getZarobki() {
		// TODO Auto-generated method stub
		//return super.getZarobki()+premia;
		return zarobki+premia;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Boss [premia=");
		builder.append(premia);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(premia);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Boss other = (Boss) obj;
		if (Double.doubleToLongBits(premia) != Double.doubleToLongBits(other.premia))
			return false;
		return true;
	}	
	
}
