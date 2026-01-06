package firstPkg;

 public class FirstProgram
{

	//data types
	//global data 
	
	final int a = 10;
	float b = 10.5f;
	char c = 'X';
	String d = "Java";
	boolean e = true;
	
	public String loc = "India";
	
	 public void printData()
	{
		final int a = 20;  //local variable
		//a=40;
		
		System.out.println(a);  //20
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	 
	 public void datavar()
	 {
		 //a = 30;
		 System.out.println(a);  //10
	 }
	
	public static void main(String[] args)
	{
		FirstProgram abc = new FirstProgram();  //instance of the class
		
		
		
		abc.printData();
		abc.datavar();  
		
		System.out.println(abc.loc);
		
		
		System.out.println(abc.a);
		
	}
	
}
