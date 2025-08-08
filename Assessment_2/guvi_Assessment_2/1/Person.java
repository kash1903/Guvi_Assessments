package guvi_Assessment_2;

public class Person  {
	
	
//	Attributes name & age 
	
	private String name ;
	private int age;
	
	
	// Default Constructor with age = 18 
	
	public Person() {
		this.age=18;
	}
	
	
	// Constructor with name & age
	
	public Person(String name,int age) {
		
		this.name= name;
		this.age= age;
	}
	
//	Method to display name & age 
	
	public void  display() {
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
	}
	
	public static void main(String[] args) {
		
//		Person Object initilized with name & age parameters 
		Person obj = new Person ("Mano" , 18);
		
//		Method called to display name & age 
		obj.display();
		
	}

}
