package cf.pisek.designpatternsexamples.strategy;

public class GoByCompanyPlane extends GoByPlane {

	@Override
	protected void getToTheAirport() {
		System.out.println("get to airport and select company plane");
	}

}
