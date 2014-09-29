package cf.pisek.designpatternsexamples.observer;

import java.util.List;
import java.util.Vector;

public class SensorSystem {
	
	private List<AlarmListener> listeners = new Vector<AlarmListener>();

	public void register(AlarmListener al) {
		listeners.add(al);
	}

	public void breakIn() {
		for (AlarmListener al : listeners) {
			al.alarm();
		}
	}
	
}
