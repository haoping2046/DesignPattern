package factoryMethod;

import javax.xml.parsers.FactoryConfigurationError;

public class MainClass {

	public static void main(String[] args) {
		
		CarFactory civicFactory = new CivicFactoryImpl();
		Car civic = civicFactory.createCar();
		civic.brandName();
		
		CarFactory hrvFactory = new HRVFactoryImpl();
		Car hrv = hrvFactory.createCar();
		hrv.brandName();

	}

}
