package msl.stat;

public class Singleton2 {
	private static class SingeltonHolder{
		private static final Singleton2 INSTANCE =new Singleton2();
	}
	public static Singleton2 getInstance() {
		return SingeltonHolder.INSTANCE;
	}
}
