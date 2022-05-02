package factoryMethod;

public class HRV extends Product {
	@Override
	protected CarFactory createCar() {
		return new HRVFactoryImpl();
	}
}
