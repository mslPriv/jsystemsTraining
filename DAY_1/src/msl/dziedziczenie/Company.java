package msl.dziedziczenie;

import java.util.*;
import java.util.stream.Stream;
class Company {
	public static void buildCompanyStrctr(String compName,Pracownik[] array) {
		
	}
    public static void main(String[] args) {
    	/*List <Pracownik> company = new ArrayList<Pracownik>();
		company.add(new Pracownik("Kowalski", 10));
		company.add(new Boss("Asuchitta", 50, 100000));
		company.add(new Pracownik("Nowak", 100));
		Collections.sort(company);
		for(Pracownik pracownik: company) {
			System.out.printf("Pracownik:%s zarobki:%f \n",pracownik.getid(),pracownik.getZarobki());
		}
		Collections.sort(company,new SortByName);
		for(Pracownik pracownik: company) {
			System.out.printf("Pracownik:%s zarobki:%f \n",pracownik.getid(),pracownik.getZarobki());
		}*/
    	
    	Pracownik[] array= {
    			new Pracownik("Kowalski", 10),
				new Boss("Asuchitta", 50, 100000),
				new Pracownik("Nowak", 200)
    	};
    	
    	
    
//    	
//    	StringBuilder builder=new StringBuilder();
//    	for(Pracownik prac:array) {
//    		builder.append(prac.getid()).append(str)
//    	}
	}
    
}


