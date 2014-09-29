package cf.pisek.designpatternsexamples.templatemethod;

public class ProgramistaArchitekt extends WaznyPracownik {

	@Override
	protected void praca1() {
		System.out.println("Pomagaj tutaj......");
	}

	@Override
	protected void praca2() {
		System.out.println("Pomagaj tam......");
	}

	@Override
	protected void praca3() {
		System.out.println("Pomagaj wszystkim wszedzie.........");
	}

}
