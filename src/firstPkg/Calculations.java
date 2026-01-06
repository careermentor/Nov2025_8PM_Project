package firstPkg;

public class Calculations 
{
	/*
	public Calculations()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println("Cons1 output: " + c);
		
	}
	
	*/
	
	public int sum()  //method declaration  //without argument/parameter
	{
		
		//method body
		int a = 20;
		int b = 30;
		int c = a+b;
		
		String e = "java";
		
		float d = 30.5f;
		
		int z = 40%2;
		System.out.println("Sum method output: " + c);
		return c;
		
		
		
		/*
		System.out.println(c);   //50
		System.out.println(a+b);  //50
		
		
		System.out.println("a" + b);  //a30
		
		System.out.println("a" + "b");  //ab
		
		System.out.println(20+30);  //50
		*/
 	}
	
	
	public Calculations(int a, int b)
	{
		int c = a+b;
		System.out.println("Cont2 output : " + c);
	}
	
	public int add(int d, int e)  //method declaration with arguments or parameters
	{
		//method body
		int f = d+e;
		//System.out.println("addition of d&e: " + f);
		return f;
		
		
	}
	
	//40,50,60
	//int y = 40,50
	//y+60
	
	public static void main(String[] args) {
		
		Calculations cal1 = new Calculations(30, 40);
		
		Calculations cal2 = new Calculations(30, 40);
		
		cal1.sum();
		
		cal2.add(50, 40);
		//int y = cal.add(40, 50);
		
	//	System.out.println(cal.add(y, 60));
		
	}
}
