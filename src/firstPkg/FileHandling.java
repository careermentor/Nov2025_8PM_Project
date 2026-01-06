package firstPkg;


import java.io.FileReader;
import java.util.Properties;

public class FileHandling
{
	
	public static void readpropfile() throws Exception
	{
		FileReader fr = new FileReader("./TestData/abc.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		
		System.out.println(prop.get("testing"));
		System.out.println(prop.get("lang"));
		System.out.println(prop.get("url"));
		
	}
	

	public static void readdata() throws Exception
	{
		
		//File f = new File("C:\\TestData\\data.txt");  //file connection
		
		//File f = new File("./TestData/data.txt");
		//FileReader fr = new FileReader(f);
		
			FileReader fr = new FileReader("./TestData/data.txt");
		
			int r = fr.read();  //69
			
			while(r!=-1)
			{
				 System.out.print((char)r);
				 r = fr.read();
				 
			}
			
		   
		
	}
	
	
	public static void main(String[] args) throws Exception 
	{
		//readdata();
		readpropfile();
	}
}
