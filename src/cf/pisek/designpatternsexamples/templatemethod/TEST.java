package cf.pisek.designpatternsexamples.templatemethod;

public class TEST {

	public static void main(String[] args) {
		
		Pracownik p;
		
		p = new Listonosz();
		p.dziennaRutyna();
		
		p = new Manager();
		p.dziennaRutyna();
		
		p = new Programista();
		p.dziennaRutyna();
		
		p = new Superman();
		p.dziennaRutyna();
		
		p = new ProgramistaArchitekt();
		p.dziennaRutyna();
		
	}
	
}
