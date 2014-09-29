package cf.pisek.designpatternsexamples.strategy;

public class GoWithTaxi extends GoByCar {

	@Override
	protected void getTheCar() {
		System.out.println("get a TAXI");
	}
	
	@Override
	protected void startTheCar() {
		//car already started
	}

}
