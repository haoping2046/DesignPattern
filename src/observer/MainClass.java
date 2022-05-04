package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class MainClass {
	
	public static void main(String[] args) {
		IObserver customer = new Customer();
		IObserver seller = new Seller();
		
		Store store = new Store();
		store.addObserver(customer);
		store.addObserver(seller);
		store.published(new Product("iPhone", 1000));

	}

}
