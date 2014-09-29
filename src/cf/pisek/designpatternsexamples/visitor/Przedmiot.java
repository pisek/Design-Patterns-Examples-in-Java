package cf.pisek.designpatternsexamples.visitor;

public class Przedmiot implements Visitable {
	
	private String name;
	
	public Przedmiot(String name) {
		this.name = name;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
