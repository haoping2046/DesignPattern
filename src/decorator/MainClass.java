package decorator;

public class MainClass {
	public static void main(String[] args) {
		SmartSpeaker smartSpeaker = new JokeSmartSpeaker(new WeatherSmartSpeaker(new SmartSpeakerImpl()));
		smartSpeaker.playMusic();
	}
}
