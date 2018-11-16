package msl.Collections.enums;

public class Koszulka {
	private String producent;
	private String getProducent() {
		return producent;
	}
	private void setProducent(String producent) {
		this.producent = producent;
	}
	private TShirtSize getRozmiar() {
		return rozmiar;
	}
	private void setRozmiar(TShirtSize rozmiar) {
		this.rozmiar = rozmiar;
	}
	private TShirtSize rozmiar;
	public Koszulka(String producent, TShirtSize rozmiar) {
		super();
		this.producent = producent;
		this.rozmiar = rozmiar;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Koszulka [producent=");
		builder.append(producent);
		builder.append(", rozmiar=");
		builder.append(rozmiar);
		builder.append("]");
		return builder.toString();
	}
	public static void main(String[] args) {
		Koszulka k=new Koszulka("PoolSizer", TShirtSize.XL);
		if(k.getRozmiar()==TShirtSize.XL) {
			System.out.println(compTshirtSize.L);
			System.out.println("NeckSize"+compTshirtSize.XL.getNeckSize());
		}
		
		switch (k.getRozmiar()) {
		case S:
			System.out.println("Size S");
			break;
		case XL:
			System.out.println("Size XL");
		default:
			break;
		}
	}
}
