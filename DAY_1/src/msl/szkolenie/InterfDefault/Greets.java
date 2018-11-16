package msl.szkolenie.InterfDefault;

public class Greets implements GreetingsEN, GreetingsPL {
	 static final String locale="EN";
	@Override
	public void greetings() {
		// TODO Auto-generated method stub
		GreetingsEN.super.greetings();
	}
	
	public static void main(String[] args) {
		Greets greet=new Greetings();
		greet.greetings();
	}
}
