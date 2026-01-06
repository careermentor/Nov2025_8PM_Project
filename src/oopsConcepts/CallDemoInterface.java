package oopsConcepts;

public class CallDemoInterface implements DemoInterface
{

	
	public void meth3() {
		
		System.out.println("Method3 of interface");
	}

	
	public void meth4() {
	
		
		System.out.println("Method4 of interface");
		
	}
	
	public static void main(String[] args) {
		
		CallDemoInterface cdi = new CallDemoInterface();
		cdi.meth3();
		cdi.meth4();
	}

}
