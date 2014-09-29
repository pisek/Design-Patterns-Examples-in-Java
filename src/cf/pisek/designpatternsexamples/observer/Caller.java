package cf.pisek.designpatternsexamples.observer;

public class Caller implements AlarmListener {
	
	public void alarm() {
		System.out.println("CALL 112");
	}

}
