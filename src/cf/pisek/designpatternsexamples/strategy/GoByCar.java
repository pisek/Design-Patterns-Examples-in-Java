package cf.pisek.designpatternsexamples.strategy;

public abstract class GoByCar implements GetToWorkStrategy {
	
	@Override
	public void goToWork() {
		getTheCar();
		startTheCar();
		driveToWork();
	}

	protected abstract void getTheCar();
	
	protected void startTheCar() {
		System.out.println("start the car");
	}
	
	protected void driveToWork() {
		System.out.println("srive to work");
	}

}