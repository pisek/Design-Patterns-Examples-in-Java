package cf.pisek.designpatternsexamples.templatemethod;

public abstract class WaznyPracownik extends Pracownik {

	@Override
	protected void pracuj() {
		praca1();
		praca2();
		praca3();
	}

	protected abstract void praca1();
	protected abstract void praca2();
	protected abstract void praca3();
	
}
