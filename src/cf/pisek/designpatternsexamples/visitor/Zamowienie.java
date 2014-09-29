package cf.pisek.designpatternsexamples.visitor;

import java.util.ArrayList;
import java.util.List;

public class Zamowienie implements Visitable {
	
	private String name;
    private List<Przedmiot> przedmioty = new ArrayList<Przedmiot>();
    
    public Zamowienie(String name, Przedmiot przedmiot) {
		this.name = name;
		dodajPrzedmiot(przedmiot);
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
		for (Przedmiot p : przedmioty) {
			p.accept(v);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
    public void dodajPrzedmiot(Przedmiot przedmiot) {
        przedmioty.add(przedmiot);
    }

}
