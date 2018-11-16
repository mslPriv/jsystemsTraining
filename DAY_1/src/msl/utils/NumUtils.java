package msl.utils;

public class NumUtils {
	static int policzPot10(int n) {
		if (n==0) {return 1;}
		System.out.println(n*10);
		return policzPot10(n-1)*10;
	}
	
	static int policzSilnia(int x) {
		if (x==0) {
			return 0; 
		}
		System.out.println(x);
		return policzSilnia(x-1)+x;
	} 
	public static void main(String[] args) {
		//int silnia=policzSilnia(5);
		//System.out.println(silnia);
		System.out.println(policzPot10(3));
	}
}
