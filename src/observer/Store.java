package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {
	private List<IObserver> observers = new ArrayList<>();
	
	public void addObserver(IObserver observer) {
		observers.add(observer);
	}
	
	public void removeObserver(IObserver observer) {
		observers.remove(observer);
	}
	
	public void published(Product product) {
		for (IObserver observer : observers) {
			observer.create(product); 
		}
	}
}
