package observer;

public class Customer implements IObserver {

	@Override
	public void create(Product product) {
		System.out.println("[Customer] Create product: " + product.getName());
	}


}
