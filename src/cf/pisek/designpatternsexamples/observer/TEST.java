package cf.pisek.designpatternsexamples.observer;

public class TEST {
	
	public static void main(String[] args) {

		SensorSystem ss = new SensorSystem();
		ss.register(new Gates());
		ss.register(new Lights());
		ss.register(new Surveillance());
		ss.register(new Caller());
		ss.breakIn();
		
	}

}
