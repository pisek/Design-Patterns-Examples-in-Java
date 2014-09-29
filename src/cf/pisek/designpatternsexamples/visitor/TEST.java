package cf.pisek.designpatternsexamples.visitor;

public class TEST {

	public static void main(String[] args) {
		
		Klient k1 = new Klient("Klient 1");
		k1.dodajZamowienie(new Zamowienie("Zam1", new Przedmiot("Przedmiot1")));
		k1.dodajZamowienie(new Zamowienie("Zam2", new Przedmiot("Przedmiot2")));
		k1.dodajZamowienie(new Zamowienie("Zam3", new Przedmiot("Przedmiot3")));
		
		Klient k2 = new Klient("Klient 1");
		Zamowienie z = new Zamowienie("Zam1", new Przedmiot("Przedmiot1"));
		z.dodajPrzedmiot(new Przedmiot("Przedmiot2"));
		k2.dodajZamowienie(z);
		
		GrupaKlientow gk = new GrupaKlientow();
		gk.addKlient(k1);
		gk.addKlient(k2);
		
		ZbieraczDanych v = new ZbieraczDanych();
		gk.accept(v);
		
		v.pokazWyniki();
		
	}
	
}
