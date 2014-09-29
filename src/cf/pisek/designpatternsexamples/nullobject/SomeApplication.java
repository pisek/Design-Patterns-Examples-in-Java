package cf.pisek.designpatternsexamples.nullobject;

import java.io.PrintStream;

public class SomeApplication {

	private PrintStream debugout;
    public SomeApplication(PrintStream debugout) {
        this.debugout = debugout;
    }
    
    public void go() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            debugout.println("i = " + i);
        }
        System.out.println("sum = " + sum);
    }
	
}
