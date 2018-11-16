package msl.szkolenie.InterfDefault;
import java.util.*;

public interface GreetingsPL {
		default void greetings() {
			System.out.println("Prosze sie przedstawic:");
			Scanner scanner=new Scanner(System.in);
			String name=scanner.nextLine();
			System.out.printf("Dzien Dobry %s",name);
		}
}
