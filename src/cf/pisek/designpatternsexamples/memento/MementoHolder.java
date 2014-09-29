package cf.pisek.designpatternsexamples.memento;

import java.util.ArrayList;
import java.util.List;

public class MementoHolder {
	private List<Memento> savedStates = new ArrayList<Memento>();

	public void addMemento(Memento m) {
		savedStates.add(m);
	}

	public Memento getMemento(int index) {
		return savedStates.get(index);
	}
}
