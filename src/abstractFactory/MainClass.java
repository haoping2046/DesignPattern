package abstractFactory;

public class MainClass {

	public static void main(String[] args) {
		CarFactory blueFactory = new BlueFactory();
		blueFactory.createCivic().brandName();
		blueFactory.createCivic().color();
		
		blueFactory.createHRV().brandName();
		blueFactory.createHRV().color();
		
		CarFactory redFactory = new RedFactory();
		redFactory.createCivic().brandName();
		redFactory.createCivic().color();
		
		redFactory.createHRV().brandName();
		redFactory.createHRV().color();
		
	}

}
