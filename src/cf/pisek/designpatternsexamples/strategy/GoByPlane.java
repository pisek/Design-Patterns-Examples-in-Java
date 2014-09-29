package cf.pisek.designpatternsexamples.strategy;

public abstract class GoByPlane implements GetToWorkStrategy {
	
	@Override
	public void goToWork() {
		getToTheAirport();
		startThePlane();
		flyToWork();
	}

	private void flyToWork() {
		System.out.println("fly to work");
	}

	private void startThePlane() {
		System.out.println("start the plane");
	}

	protected abstract void getToTheAirport();

}