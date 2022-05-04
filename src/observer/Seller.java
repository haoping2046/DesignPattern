package observer;

public class Seller implements IObserver {

	@Override
	public void create(Product product) {
		System.out.println("[Seller] Create product: " + product.getName());
	}

}
