package msl.Collections;

import java.util.*;

public class Other {
	public static void main(String[] args) {
		String [] array= {"A","a","b","c","#"};
		Integer [] arrayInt= {1,2,3,4};
		Collections.shuffle(Arrays.asList(arrayInt));
		System.out.println(Arrays.toString(arrayInt));
		Collections.shuffle(Arrays.asList(arrayInt));
		System.out.println(Arrays.toString(arrayInt));
		Arrays.sort(array);
		List <String> asList=Arrays.asList(array);
		Collections.reverse(asList);
		String [] wynikowa=asList.toArray(new String[0]);
		System.out.println(Arrays.toString(wynikowa));
	}
}
