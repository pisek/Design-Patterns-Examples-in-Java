package cf.pisek.designpatternsexamples.state;

public abstract class State {
	public void pull(Chain wrapper) {
		wrapper.setState(new Off());
		System.out.println("   turning off");
	}
}