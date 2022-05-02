package singleton;

public class Singleton {
	
	// Do not allow external class instantiation
	private Singleton() {
		
	}
	
	// Mode 1: public the static instance
	public static final Singleton p_instance = new Singleton();
	

	// Mode 2
	private static Singleton _instance;
	public static Singleton getInstance() {
		if(_instance == null) 
			_instance = new Singleton();
		return _instance;
	}
}
