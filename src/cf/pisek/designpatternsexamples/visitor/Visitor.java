package cf.pisek.designpatternsexamples.visitor;

public interface Visitor {

	void visit(Klient klient);
	void visit(Zamowienie zamowienie);
	void visit(Przedmiot przedmiot);
	
}
