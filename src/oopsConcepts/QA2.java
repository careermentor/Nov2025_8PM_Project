package oopsConcepts;

public class QA2 extends QA1
{
	
	int x = 100;
	
	public void printValX()
	{
		int x = 200;
		System.out.println(x);
		System.out.println(this.x);
		
		System.out.println(super.x);
		
		super.sum(20, 30);
		
	}
	
	
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of a&b: " + c );
	}
	
	
	public void subs(int a, int b)
	{
		int c = a-b;
		System.out.println("subs of a&b: " + c );
	}
	
	public static void main(String[] args) {
		
		
		QA2 q2 = new QA2();
		q2.printValX();
		//q2.subs(30, 20);
		
		//QA1 q21 = new QA1();
		q2.sum(20, 30);
		
		
		//System.out.println(q2.name);
		//q2.qa1im();
		
	}

	
	public void qa1im() {
		System.out.println("this is QA1I method");
		
	}
	
}
