package msl.szkolenie;

public class Point {
 int x; int y;

public int getX() {
	return x;
}



public int getY() {
	return y;
}



public Point(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}

 @Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Point [x=");
	builder.append(x);
	builder.append(", y=");
	builder.append(y);
	builder.append("]");
	return builder.toString();
}
}
