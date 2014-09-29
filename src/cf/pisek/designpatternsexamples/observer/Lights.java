package cf.pisek.designpatternsexamples.observer;

public class Lights implements AlarmListener {

	@Override
	public void alarm() {
		System.out.println("LIGHTS UP");
	}

}
