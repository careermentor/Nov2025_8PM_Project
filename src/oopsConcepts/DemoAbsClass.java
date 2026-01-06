package oopsConcepts;

public abstract class DemoAbsClass 
{
	
	final int a = 20;

	public void meth1()
	{
		//a=30;
		System.out.println("this is concrete method");  
	}
	
	public abstract void meth2();
	
	public static void main(String[] args) 
	{
		//DemoAbsClass da = new DemoAbsClass();
		//da.meth1();
	}
	
}
