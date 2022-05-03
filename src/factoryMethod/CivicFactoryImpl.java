package factoryMethod;

public class CivicFactoryImpl implements CarFactory  {
	
	@Override 
	public Car createCar() {
		return new Civic();
	}
}
