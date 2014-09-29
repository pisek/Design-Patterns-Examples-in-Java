package cf.pisek.designpatternsexamples.templatemethod;

public class Superman extends Pracownik {

	@Override
	protected void pracuj() {
		System.out.println("Ratuj damy w opresji");
	}

}
