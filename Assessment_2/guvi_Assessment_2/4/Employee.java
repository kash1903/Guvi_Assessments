package guvi_Assessment_2;

public class Employee extends Person1  {
	
//	Employee with id & salary attribute 
	
	int id  ;
	double salary;
	
	
//	constructor using super to initilize  person Attribute 
	
	public Employee(String name, int age , int id ,double salary) {
		
	super(name, age);
	this.id = id;
	this.salary= salary;
		
	}
	
	
	public void displayEmployee() {
		
		System.out.println("Employee_Id :" + id);
		System.out.println("salary :" + salary);
	}
	

	public static void main(String[] args) {
		
		Employee obj = new Employee ("Mano" , 18 , 101 , 2340000.00);
		
		obj.displayPerson1();
		obj.displayEmployee();
		
    

	}

}
