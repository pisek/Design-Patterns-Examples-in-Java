package cf.pisek.designpatternsexamples.visitor;

import java.util.ArrayList;
import java.util.List;

public class Klient implements Visitable {
	
	private String name;
    private List<Zamowienie> zamowienia = new ArrayList<Zamowienie>();
    
    public Klient(String name) {
		this.setName(name);
	}
    
    public void dodajZamowienie(Zamowienie zamowienie) {
        zamowienia.add(zamowienie);
    }

	@Override
	public void accept(Visitor v) {
		v.visit(this);
		for (Zamowienie z : zamowienia) {
			z.accept(v);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
