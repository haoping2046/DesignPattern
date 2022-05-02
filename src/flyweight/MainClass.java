package flyweight;

public class MainClass {

	public static void main(String[] args) {
		
		FlyweightFactory factory = new FlyweightFactory();
		
		Flyweight flyweight = factory.getFlyweight(new String("Takela"));
		flyweight.operation("state");
		
        flyweight = factory.getFlyweight(new String("Beer"));
        flyweight.operation("state");
		
        flyweight = factory.getFlyweight(new String("Takela"));
        flyweight.operation("state");
        
        flyweight = factory.getFlyweight(new String("Beer"));
        flyweight.operation("state");

        
	}

}
