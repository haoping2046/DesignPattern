package factoryMethod;

public class HRVFactoryImpl implements CarFactory {
	
	@Override 
	public Car createCar() {
		return new HRV();
	}
}
