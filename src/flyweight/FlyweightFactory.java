package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	
	private Map<Object, Flyweight> flyweights = new HashMap<Object, Flyweight>();
	
	public Flyweight getFlyweight(Object state) {
		
		Flyweight flyweight = flyweights.get(state);
		
		if (flyweight != null) {
			System.out.print("The obj exist, reuse this obj: ");
			return flyweight;
		}
			
		flyweight = new ConcreteFlyweight(state);
		flyweights.put(state, flyweight);
		
		return flyweight;
	}
}
