package cf.pisek.designpatternsexamples.strategy;

public class GoWithPersonalCar extends GoByCar {

	@Override
	protected void getTheCar() {
		System.out.println("go to private car");
	}

}
