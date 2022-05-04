package decorator;

public class WeatherSmartSpeaker extends SmartSpeakerDecorate {

	public WeatherSmartSpeaker(SmartSpeaker smartSpeaker) {
		super(smartSpeaker);
		// TODO Auto-generated constructor stub
	}

	public void weather() {
		System.out.println("Today is rainning!");
	}

	@Override
	public void playMusic() {
		super.playMusic();
		weather();
	}

}
