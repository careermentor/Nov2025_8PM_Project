package oopsConcepts;

public class CallDemoAbsClass extends DemoAbsClass
{


	public void meth2() 
	{
		System.out.println("this is my secret code");
	}
	
	public static void main(String[] args) {
		
		CallDemoAbsClass cab = new CallDemoAbsClass();
		cab.meth1();
		cab.meth2();
		
	}

}
