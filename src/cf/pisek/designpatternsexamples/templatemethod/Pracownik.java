package cf.pisek.designpatternsexamples.templatemethod;

public abstract class Pracownik {

	public void dziennaRutyna() {
		wstawaj();
		sniadanie();
		idzDoPracy();
		pracuj();
		wracajZPracy();
		relaks();
		spij();
	}

	protected void wstawaj() {
		System.out.println("wstawaj");
	}
	
	protected void sniadanie() {
		System.out.println("sniadanie");
	}
	
	protected void idzDoPracy() {
		System.out.println("idzDoPracy");
	}
	
	protected abstract void pracuj();
	
	protected void wracajZPracy() {
		System.out.println("wracajZPracy");
	}
	
	protected void relaks() {
		System.out.println("relaks");
	}
	
	protected void spij() {
		System.out.println("spij");
	}

}
