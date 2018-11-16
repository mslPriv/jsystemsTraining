package msl.dziedziczenie;

public class Pracownik implements Comparable<Pracownik>{
	public Pracownik(String id, double zarobki) {
		super();
		this.id = id;
		this.zarobki = zarobki;
	}
	
	protected String id;
	protected double zarobki;

	public String getid() {
		return id;
	}
//	public void setid(String id) {
//		this.id = id;
//	}
	public double getZarobki() {
		return zarobki;
	}
//	public void setZarobki(double zarobki) {
//		this.zarobki = zarobki;
//	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pracownik [id=");
		builder.append(id);
		builder.append(", zarobki=");
		builder.append(zarobki);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		long temp;
		temp = Double.doubleToLongBits(zarobki);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pracownik other = (Pracownik) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (Double.doubleToLongBits(zarobki) != Double.doubleToLongBits(other.zarobki))
			return false;
		return true;
	}
	@Override
	public int compareTo(Pracownik o) {
		return Double.compare(this.getZarobki(),o.getZarobki()); 		
	}
}
