package oopsConcepts;

public class DemoEncaps 
{

	private  String name = "John";
	private  int age = 40;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		
		DemoEncaps de = new DemoEncaps();
		
		
		System.out.println(de.getName());
		System.out.println(de.getAge());
		
	}

	
	
	
}
