package adapter;

public class Transfer extends CarServiceV2 implements CarService {

	@Override
	public void maintance() {
		super.maintanceRequest();
	}

}
