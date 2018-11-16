package msl.szkolenie.InterfDefault;
import java.util.*;
public interface Greetings {
	default void greetings() {
		System.out.println("Please introduce yourself:");
		Scanner scanner=new Scanner(System.in);
		String name=scanner.nextLine();
		System.out.printf("HowDoYouDo %s",name);
	}
	static void hello() {
		System.out.println("Testem jestem mowie z gestem");
	}
}
