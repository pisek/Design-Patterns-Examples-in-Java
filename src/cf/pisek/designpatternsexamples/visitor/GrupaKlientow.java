package cf.pisek.designpatternsexamples.visitor;

import java.util.ArrayList;
import java.util.List;

public class GrupaKlientow implements Visitable {
    private List<Klient> klienci = new ArrayList<Klient>();

    public void accept(Visitor v) {
    	for (Klient k : klienci) {
			k.accept(v);
		}
    }

    public void addKlient(Klient klient) {
        klienci.add(klient);
    }
}