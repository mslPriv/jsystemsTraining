package msl.szkolenie;

public class MyFirstClass implements MyInterface {

	@Override
	public void doSomething() {
		System.out.println("Implementacja Metody z interfejsu");
		
	}
    
	public static void main(String[] args) {
		MyFirstClass test =new MyFirstClass();
		test.doSomething();
	}
}
