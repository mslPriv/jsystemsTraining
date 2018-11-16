package msl.dziedziczenie;

import java.util.Comparator;
public class SortByName implements Comparator<Pracownik>{
		public int compare(Pracownik o1, Pracownik o2) {
			return o1.id.compareTo(o2.id);
		}
}
