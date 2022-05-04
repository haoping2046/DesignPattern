package decorator;

public class SmartSpeakerDecorate implements SmartSpeaker {

	private SmartSpeaker smartSpeaker;
	public SmartSpeakerDecorate(SmartSpeaker smartSpeaker) {
		this.smartSpeaker = smartSpeaker;
	}
	
	@Override
	public void playMusic() {
		smartSpeaker.playMusic();
	}

}
