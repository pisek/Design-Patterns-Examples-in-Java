package cf.pisek.designpatternsexamples.state;

public class Chain {
	private State current;

	public Chain() {
		current = new Off();
	}

	public void setState(State s) {
		current = s;
	}

	public void pull() {
		current.pull(this);
	}
}
