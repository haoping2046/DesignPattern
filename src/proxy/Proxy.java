package proxy;

public class Proxy implements Agent {

	private Actor actor;
	
	public Proxy(Actor actor) {
		super();
		this.actor = actor;
	}
	
	@Override
	public void celebrity() {
		actor.celebrity();
		System.out.println("Agent negotiating... ");
	}



}
