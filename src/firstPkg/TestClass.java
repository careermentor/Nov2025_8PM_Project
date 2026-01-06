package firstPkg;

public class TestClass 
{

	int age=40;
	
	public void val()
	{
		System.out.println(age);
	}
	
	public static void main(String[] args) 
	{
		TestClass tc = new TestClass();
		
		tc.val();
		
		System.out.println(tc.age);
		
	}
	
}