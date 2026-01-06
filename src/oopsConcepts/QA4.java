package oopsConcepts;

public class QA4 extends QA2 implements QA3I
{

	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("division of a&b: " + c );
	}
	
	public static void main(String[] args) {
		
		
		QA4 q4 = new QA4();
		q4.div(40, 20);
		
		//q3.mul(20, 30);
		
		q4.subs(30, 20);
		
		//QA1 q21 = new QA1();
		q4.sum(20, 30);
		
		//System.out.println(q4.name);
		q4.qa3im();
		q4.qa1im();
		
	}

	
	public void qa3im() {
	
		System.out.println("QA3I method");
		
	}
	
}
