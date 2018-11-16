package msl.szkolenie;
import msl.szkolenie.Point;
public class Pointer {
	public static Point pLast;
	
	public Pointer() {
	
	}
	public void addPoint(Point p) {
		pLast=p;
	}
	public void printLast() {
		System.out.println(pLast);
	}
	public static void main(String[] args) {
		Pointer p1=new Pointer();
		Pointer p2=new Pointer();
		p1.addPoint(new Point(1,1));
		p2.addPoint(new Point(2,2));
		p1.printLast();
		p2.printLast();
	}
}
