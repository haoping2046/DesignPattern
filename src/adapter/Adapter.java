package adapter;

public class Adapter extends CarServiceV2 implements CarService {

	@Override
	public void maintance() {
		super.maintanceRequest();
	}

}
