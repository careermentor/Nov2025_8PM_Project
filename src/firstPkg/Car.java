package firstPkg;

public class Car 
{

	String brand = "Hyundia";
	String model = "Creta";
	int year = 2015;
	
	
	
	
	
	//Write a class Car with attributes brand, model, and year ; Create objects and print their details.
	
	public static void main(String[] args) 
	{
	
		Car car = new Car();
				
		System.out.println(car.brand);
		System.out.println(car.model);
		System.out.println(car.year);
		
		StaticDemo.printValuex();
		
	}
}
