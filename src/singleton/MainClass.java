package singleton;

public class MainClass {

	public static void main(String[] args) {
		
		// Use mode 1
		Singleton s_instance = Singleton.p_instance;
		
		// Use mode 2
		Singleton instance = Singleton.getInstance();
	}

}
