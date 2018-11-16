package msl.szkolenie;
 import java.util.Scanner;
public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String opType=s.nextLine();
		int val1=5; 
		int val2=10;
		Operation calc;
		boolean addIt=true;
		if("A".equalsIgnoreCase(opType)) {
			calc=new Adder();
		}
		else {
			calc=new Operation(){
				@Override
				public int perform(int val1, int val2) {						
					return val2/val1;
				}
			
			};
		}
		System.out.println(calc.perform(val1, val2));
 
	}

}
