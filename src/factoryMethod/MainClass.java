package factoryMethod;

import javax.xml.parsers.FactoryConfigurationError;

public class MainClass {

	public static void main(String[] args) {
		
		CarFactory civic = new Civic().getFactory();
		civic.printInfo();
		
		CarFactory hrv = new HRV().getFactory();
		hrv.printInfo();

	}

}
