package adapter;

public class MainClass {

	public static void main(String[] args) {
		CarService cs = new Adapter();
		cs.maintance();
	}

}
