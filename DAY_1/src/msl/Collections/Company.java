package msl.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import msl.stat.Pracownik;

public class Company {
	public static void main(String[] args) {
		Comparator<Pracownik> compareByName = new Comparator<Pracownik>() {
			@Override
			public int compare(Pracownik o1, Pracownik o2) {
				return (o1.getNazwisko() + o1.getImie()).compareTo(o2.getNazwisko() + o1.getImie());
			}
		};
		Comparator<Pracownik> compareBySalaries = new Comparator<Pracownik>() {
			@Override
			public int compare(Pracownik o1, Pracownik o2) {
				return (Double.compare(o1.getPensja(),o2.getPensja()));
			}
		};

		List<Pracownik> pracownicy = new ArrayList<>();
		pracownicy.addAll(Arrays.asList(
				new Pracownik.PracownikBuilder().withAge(20).withNazwisko("Kowalski").withImie("Jan").withPensja(2000.5).withStanowisko("Junior")
						.build(),
				new Pracownik.PracownikBuilder().withAge(50).withNazwisko("Nowak").withImie("Jan").withPensja(8000).withStanowisko("Senior")
						.build(),
				new Pracownik.PracownikBuilder().withAge(100).withNazwisko("Patusinski").withImie("Czes³aw").withStanowisko("Manago")
						.withPensja(3000).build(),
				new Pracownik.PracownikBuilder().withAge(30).withNazwisko("Pietrusinski").withImie("Jan").withStanowisko("Junior")
						.withPensja(3000).build(),
				new Pracownik.PracownikBuilder().withAge(30).withNazwisko("Pietusinski").withImie("Czes³aw").withStanowisko("Junior")
						.withPensja(3000).build(),
				new Pracownik.PracownikBuilder().withAge(30).withNazwisko("Pitusinski").withImie("Czes³aw")
						.withPensja(3000).build()		
				));
//		int age=0;
//		double salaries=0;
//		for(Iterator<Pracownik> iterator=pracownicy.iterator();iterator.hasNext();) {}
//		for(Pracownik prac:pracownicy) {
//			age+=prac.getAge();
//			salaries+=prac.getPensja();
//		}
//		System.out.printf("total salaries:%s, avg_age:%f",salaries,age/(double)pracownicy.size());
//		DoubleSummaryStatistics sumStats=pracownicy.stream().collect(Collectors.summarizingDouble(Pracownik::getPensja));
//		IntSummaryStatistics intSumStats=pracownicy.stream().collect(Collectors.summarizingInt(Pracownik::getAge));
//		System.out.printf("\n avg salarises:%f ",sumStats.getSum());
//		System.out.printf("\n avg age:%f ",intSumStats.getAverage());
//		pracownicy.sort(compareBySalaries);
	//	Set<Pracownik> pracbySalSet = new TreeSet<Pracownik>(compareBySalaries);
	//	pracbySalSet.addAll(pracownicy);
		Set<Pracownik>pracbySalSet=new TreeSet<>(pracownicy);
		Set<Pracownik> pracbyNameSet = new TreeSet<>(compareByName);
		pracbyNameSet.addAll(pracownicy);
		for (Pracownik prac : pracownicy) {
			System.out.println(prac);
		}
		System.out.println("bySalaries");
		for (Pracownik prac : pracbySalSet) {
			System.out.println(prac);
		}
		System.out.println("byName");
		for (Pracownik prac : pracbyNameSet) {
			System.out.println(prac);
		}

	}
}
