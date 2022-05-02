package flyweight;

public class ConcreteFlyweight implements Flyweight {
	
	private Object intrinsicState = null;
	
	public ConcreteFlyweight(Object state) {
		intrinsicState = state;
	}
	
	@Override
	public void operation(Object extrinsicState) {
		System.out.println(intrinsicState);
	}
}
