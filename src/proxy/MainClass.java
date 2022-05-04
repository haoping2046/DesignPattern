package proxy;

public class MainClass {

	public static void main(String[] args) {
		Agent agent = new Proxy(new Actor());
		agent.celebrity();
	}

}
