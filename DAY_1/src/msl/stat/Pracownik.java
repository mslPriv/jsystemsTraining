package msl.stat;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Pracownik implements Serializable, Comparable<Pracownik>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String imie;
	private String nazwisko;
	private String stanowisko;
	public String getStanowisko() {
		return stanowisko==null?"Unknown":stanowisko;
	}
	private void setStanowisko(String stanowisko) {
		this.stanowisko = stanowisko;
	}


	private double pensja=0;
	public int getAge() {
		return age;
	}
	private void setAge(int age) {
		this.age = age;
	}
	private void setPensja(double pensja) {
		this.pensja = pensja;
	}


	private int age;
	public double getPensja() {
		return pensja;
	}
	

	private transient int pesel;//RODO!
	private Date dataZatr;
	public static class PracownikBuilder {
		private Pracownik pracownik=new Pracownik();
		public PracownikBuilder() {
			// TODO Auto-generated constructor stub
		}
		public PracownikBuilder withImie(String name) {
			pracownik.setImie(name);
			return this;
		}
		public PracownikBuilder withNazwisko(String name) {
			pracownik.setNazwisko(name);
			return this;
		}
		public PracownikBuilder withPesel(int pesel) {
			pracownik.setPesel(pesel);
			return this;
		}
		public PracownikBuilder withPensja(double pensja) {
			pracownik.setPensja(pensja);
			return this;
		}
		public PracownikBuilder withAge(int age) {
			pracownik.setAge(age);
			return this;
		}
		
		public PracownikBuilder withStanowisko(String stanowisko) {
			pracownik.setStanowisko(stanowisko);
			return this;
		}
		
		public Pracownik build() {
			return pracownik;
		}
	}
	
	private void readObject(ObjectInputStream stream) throws ClassNotFoundException,IOException {
		// TODO Auto-generated method stub
		stream.defaultReadObject();
		pesel=-1;
	}
	private void writeObject(ObjectOutputStream stream) throws ClassNotFoundException,IOException{
		stream.defaultWriteObject();
		pesel=-1;
	}

/*	public static void main(String[] args) {
		Pracownik p=new Pracownik.PracownikBuilder().withImie("Micha³").withNazwisko("Kowalski").build();
	}
*/
	public String getImie() {
		return imie;
	}

	private void setImie(String imie) {
		this.imie = imie;
	}
	
	private void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	
	public int getPesel() {
		return pesel;
	}

	private void setPesel(int pesel) {
		this.pesel = pesel;
	}
	@Override
	public String toString() {
		return "Pracownik [imie=" + imie + ", nazwisko=" + nazwisko + ", pensja=" + pensja + ", pesel=" + pesel
				+ ", dataZatr=" + dataZatr + "]";
	}

//	@Override
	public int compareTo(Pracownik o) {
		int result=Double.compare(this.pensja,o.getPensja());		
//		if(result==0) {
//			return (this.equals(o)==true) ? 0 : 1; 
//		}
//		else {
//			return result;
//		}
		return result==0 ?(this.imie+this.nazwisko).compareTo(o.getImie()+o.getNazwisko()):result;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((dataZatr == null) ? 0 : dataZatr.hashCode());
		result = prime * result + ((imie == null) ? 0 : imie.hashCode());
		result = prime * result + ((nazwisko == null) ? 0 : nazwisko.hashCode());
		long temp;
		temp = Double.doubleToLongBits(pensja);
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
		if (age != other.age)
			return false;
		if (dataZatr == null) {
			if (other.dataZatr != null)
				return false;
		} else if (!dataZatr.equals(other.dataZatr))
			return false;
		if (imie == null) {
			if (other.imie != null)
				return false;
		} else if (!imie.equals(other.imie))
			return false;
		if (nazwisko == null) {
			if (other.nazwisko != null)
				return false;
		} else if (!nazwisko.equals(other.nazwisko))
			return false;
		if (Double.doubleToLongBits(pensja) != Double.doubleToLongBits(other.pensja))
			return false;
		return true;
	}

}


