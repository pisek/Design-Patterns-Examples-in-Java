package cf.pisek.designpatternsexamples.strategy;

public class GoWithRentedCar extends GoByCar {

	@Override
	protected void getTheCar() {
		System.out.println("go to car rental service and rent a car");
	}

}
