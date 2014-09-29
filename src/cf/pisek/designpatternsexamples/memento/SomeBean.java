package cf.pisek.designpatternsexamples.memento;

public class SomeBean {

	private String state;

	public void set(String state) {
		System.out.println("SomeBean: Setting state to " + state);
		this.state = state;
	}

	public Memento saveToMemento() {
		System.out.println("SomeBean: Saving to Memento.");
		return new Memento(state);
	}

	public void restoreFromMemento(Memento m) {
		state = m.getSavedState();
		System.out.println("SomeBean: State after restoring from Memento: " + state);
	}

}
