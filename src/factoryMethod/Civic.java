package factoryMethod;

public class Civic extends Product {
	
	@Override
	protected CarFactory createCar() {
		return new CivicFactoryImpl();
	}
}
