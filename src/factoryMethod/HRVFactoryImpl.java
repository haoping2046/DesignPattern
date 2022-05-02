package factoryMethod;

public class HRVFactoryImpl implements CarFactory {
	
	@Override 
	public void printInfo() {
		System.out.println("This is a HRV");
	}
}
