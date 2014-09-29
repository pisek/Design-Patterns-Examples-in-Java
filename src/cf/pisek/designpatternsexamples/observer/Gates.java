package cf.pisek.designpatternsexamples.observer;

public class Gates implements AlarmListener {

	@Override
	public void alarm() {
		System.out.println("CLOSE GATES");
	}

}
