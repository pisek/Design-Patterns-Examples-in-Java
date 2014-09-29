package cf.pisek.designpatternsexamples.nullobject;

public class TEST {

	public static void main(String[] args) {
		
		SomeApplication sa = new SomeApplication(new NullPrintStream());
		sa.go();
		
	}
	
}
