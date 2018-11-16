package msl.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.concurrent.Worker;
import msl.stat.Pracownik;

public class OtherCompany {
	public static final List<Pracownik> PRACOWNICY;
	static {
		PRACOWNICY = new ArrayList<Pracownik>();
		PRACOWNICY.addAll((Arrays.asList(
				new Pracownik.PracownikBuilder().withAge(20).withNazwisko("Kowalski").withImie("Jan").withPensja(2000.5)
						.withStanowisko("Junior").build(),
				new Pracownik.PracownikBuilder().withAge(50).withNazwisko("Nowak").withImie("Jan").withPensja(8000)
						.withStanowisko("Senior").build(),
				new Pracownik.PracownikBuilder().withAge(100).withNazwisko("Patusinski").withImie("Czes³aw")
						.withStanowisko("Manago").withPensja(3000).build(),
				new Pracownik.PracownikBuilder().withAge(30).withNazwisko("Pietrusinski").withImie("Jan")
						.withStanowisko("Junior").withPensja(3000).build(),
				new Pracownik.PracownikBuilder().withAge(30).withNazwisko("Pietusinski").withImie("Czes³aw")
						.withStanowisko("Junior").withPensja(3000).build(),
				new Pracownik.PracownikBuilder().withAge(30).withNazwisko("Pitusinski").withImie("Czes³aw")
						.withPensja(3000).build())));
	}

	public static Map<String, List<Pracownik>> STANOWISKO_2_PRACOWNICY;
	static {
		STANOWISKO_2_PRACOWNICY = new HashMap<>();
		for(Pracownik prac:PRACOWNICY) {
			if(STANOWISKO_2_PRACOWNICY.containsKey(prac.getStanowisko())) {
				STANOWISKO_2_PRACOWNICY.get(prac.getStanowisko()).add(prac);
			}
			else {
				STANOWISKO_2_PRACOWNICY.put(prac.getStanowisko(),new ArrayList<Pracownik>(Arrays.asList(prac)));
			}
		}
	}

	public static void main(String[] args) {
//		HashMap<String, Pracownik> workers = new HashMap<>();
//		for (Pracownik worker : PRACOWNICY) {
//			workers.put(worker.getNazwisko(), worker);
//		}
//		System.out.println("by values");
//		for (Pracownik w: workers.values()) {
//			System.out.println(w.toString());
//		}
		System.out.println("by keySet");
		for (String stanowisko:STANOWISKO_2_PRACOWNICY.keySet()) {
			System.out.println(stanowisko+':');
			for(Pracownik prac:STANOWISKO_2_PRACOWNICY.get(stanowisko)) {
				System.out.println("\t"+prac.toString());
			}

		}
	//		System.out.println("by Entries");
//		for (Map.Entry<String,Pracownik> entry:workers.entrySet()) {
//			entry.
//		}
	}
}
