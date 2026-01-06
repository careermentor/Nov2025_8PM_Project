package secondPkg;

import firstPkg.FirstProgram;
import firstPkg.ThirdClass;

public class SecondProgram 
{

	public static void main(String[] args) 
	{
		/*
		
		System.out.println("Hello main method");
		
		
		FirstProgram xyz = new FirstProgram();  //instance of the class
		
		xyz.printData();
		
		System.out.println(xyz.loc);
		
		*/
		
		ThirdClass tc = new ThirdClass();
		tc.main(args);
	}

}
