package cf.pisek.designpatternsexamples.templatemethod;

public class Manager extends Pracownik {

	@Override
	protected void pracuj() {
		System.out.println("zarządzaj wszystkim...");
	}

}
