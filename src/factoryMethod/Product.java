package factoryMethod;

public abstract class Product {
	
	abstract protected CarFactory createCar();
	
	public CarFactory getFactory() {
		return createCar();
	}
	
}
