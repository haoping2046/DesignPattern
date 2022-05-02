package factoryMethod;

public class CivicFactoryImpl implements CarFactory  {
	
	@Override 
	public void printInfo() {
		System.out.println("This is a Civic");
	}
}
