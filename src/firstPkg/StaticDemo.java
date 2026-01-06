package firstPkg;

public class StaticDemo
{
	static int x = 100;

	public static void printValuex()
	{
		
		System.out.println(x);
	}
	
	public void meth2()
	{
		System.out.println("this is non static method");
	}
	
	public static void main(String[] args) 
	{
	
		printValuex();
		
		StaticDemo sd = new StaticDemo();
		sd.meth2();
		
	}
	
}
