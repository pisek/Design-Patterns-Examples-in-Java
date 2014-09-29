package cf.pisek.designpatternsexamples.strategy;

public abstract class GoByBus implements GetToWorkStrategy {
	
	@Override
	public void goToWork() {
		getToTheBusStop();
		getOnTheBus();
		driveToWork();
	}

	protected abstract void getToTheBusStop();
	
	protected void getOnTheBus() {
		System.out.println("get on the bus");
	}
	
	protected void driveToWork() {
		System.out.println("drive to work");
	}

}