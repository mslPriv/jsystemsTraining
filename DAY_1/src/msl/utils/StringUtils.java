package msl.utils;
	
public final class StringUtils {
	public static String lastWord;
	public static boolean ifAOnB(String test) {
		lastWord=test;
		return 'A'==test.charAt(0);	
	}
	
	public static boolean isPalindrome(String word){
	//	return word.equals(new StringBuilder().append(word).reverse().toString()); 
		return new StringBuilder().append(word).reverse().toString().equals(word);
	}
	public static void main(String[] args) {
//		System.out.println(ifAOnB("AlaMaKota"));
//		System.out.println(StringUtils.ifAOnB("BabaMaKota"));
//		System.out.println(StringUtils.lastWord);
		System.out.println(StringUtils.isPalindrome(null));
		System.out.println(StringUtils.isPalindrome("ABBA"));
		System.out.println(StringUtils.isPalindrome("maKota"));
	}
}
