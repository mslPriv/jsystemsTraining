package msl.stat;



public class Singleton {
	private static volatile Singleton instance= null;
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	static Singleton getInstance() {
		if (instance==null) {
			synchronized(Singleton.class) {
					if(instance==null) {
						instance=new Singleton();
					}
			}
		}
		return instance;
	}
}
