package cf.pisek.designpatternsexamples.memento;

public class TEST {
	public static void main(String[] args) {

		MementoHolder ms = new MementoHolder();
		
		SomeBean b = new SomeBean();
		b.set("State1");
		b.set("State2");
		ms.addMemento(b.saveToMemento());
		b.set("State3");
		ms.addMemento(b.saveToMemento());
		b.restoreFromMemento(ms.getMemento(0));
		b.set("State4");
		b.restoreFromMemento(ms.getMemento(1));
		
	}
}
