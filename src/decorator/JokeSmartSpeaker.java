package decorator;

public class JokeSmartSpeaker extends SmartSpeakerDecorate {

	public JokeSmartSpeaker(SmartSpeaker smartSpeaker) {
		super(smartSpeaker);
		// TODO Auto-generated constructor stub
	}
	
	public void joke() {
		System.out.println("What do you call a deer with no eyes?");
		System.out.println("No idea! Since no eye deer");
	}

	@Override
	public void playMusic() {
		super.playMusic();
		joke();
	}

}
