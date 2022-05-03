package abstractFactory;

public class RedFactory implements CarFactory {

	@Override
	public Car createCivic() {
		return new RedCivic();
	}

	@Override
	public Car createHRV() {
		return new RedHRV();
	}

}
