package msl.finals;


public class Calculator {
	private final double maxDist;
	private static final msl.szkolenie.Point p0=new msl.szkolenie.Point(0,0);
	
	{
		maxDist=1200;
	}
	
	public static final double distanceFromZero(Point p) {		
		return Math.sqrt(dist(p0.getX(),p.getX())+dist(p0.getY(),p.getY()));
	}
	private static double dist(double i, double j) {
		return Math.abs(Math.pow(i,2)-Math.pow(j,2));
	}
}
