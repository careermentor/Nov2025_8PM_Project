package org.wipro.auto.saucedemo.utilities;

import java.io.FileReader;
import java.util.Properties;

public class ReadPropFile 
{

	public static String readconfig(String key) throws Exception
	{
		FileReader fr = new FileReader("./config/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		
	}
	
	public static String readelement(String key) throws Exception
	{
		FileReader fr = new FileReader("./config/element.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		
	}
	
}
