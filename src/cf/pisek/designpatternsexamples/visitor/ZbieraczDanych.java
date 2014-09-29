package cf.pisek.designpatternsexamples.visitor;

public class ZbieraczDanych implements Visitor {
	
	private int liczbaKlientow = 0;
    private int liczbaZamowien = 0;
    private int liczbaPrzedmiotow = 0;

	@Override
	public void visit(Klient klient) {
		System.out.println(klient.getName());
		liczbaKlientow++;
	}

	@Override
	public void visit(Zamowienie zamowienie) {
		System.out.println(zamowienie.getName());
		liczbaZamowien++;
	}

	@Override
	public void visit(Przedmiot przedmiot) {
		System.out.println(przedmiot.getName());
		liczbaPrzedmiotow++;
	}
	
	public void pokazWyniki() {
		System.out.println("Liczba klientów:" + liczbaKlientow);
        System.out.println("Liczba zamówień:" + liczbaZamowien);
        System.out.println("Liczba przedmiotów: " + liczbaPrzedmiotow);
	}

}
