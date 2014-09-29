package cf.pisek.designpatternsexamples.observer;

public class Surveillance implements AlarmListener {
	
	public void alarm() {
		System.out.println("SHOW ON CAMERAS");
	}

}
