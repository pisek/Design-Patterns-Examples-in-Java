package cf.pisek.designpatternsexamples.templatemethod;

public class Listonosz extends Pracownik {

	@Override
	protected void pracuj() {
		System.out.println("Wysylaj listy... czy cos...");
	}

}
