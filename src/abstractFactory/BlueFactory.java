package abstractFactory;

public class BlueFactory implements CarFactory {

	@Override
	public Car createCivic() {
		return new BlueCivic();
	}
	
	@Override
	public Car createHRV() {
		return new BlueHRV();
	}
	
}
