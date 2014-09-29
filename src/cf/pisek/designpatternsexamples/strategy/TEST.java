package cf.pisek.designpatternsexamples.strategy;

public class TEST {

	public static void main(String[] args) {
		
		GetToWorkStrategy strategy;
		
		strategy = new GoByBus155();
		strategy.goToWork();
		
		strategy = new GoByCompanyPlane();
		strategy.goToWork();
		
		strategy = new GoWithPersonalCar();
		strategy.goToWork();
		
		strategy = new GoWithRentedCar();
		strategy.goToWork();
		
		strategy = new GoWithTaxi();
		strategy.goToWork();
		
	}
	
}
