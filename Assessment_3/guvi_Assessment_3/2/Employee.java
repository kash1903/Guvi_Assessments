package guvi_Assessment_3;

//Employee Class 

public class Employee  implements Taxable  {
	
	
//Attributes of Employee 
	
	int empId ;
	String name ;
	double salary;
	
	
//	Parameterised contructor of Employee 
	
	
	public Employee(int empId,String name,double salary) {
		this.empId=empId;
		this.name = name;
		this.salary= salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}

//	Implemented Abstract methods of Taxable Interface 
	
	@Override
	public double  calcTax() {
		
//		Income tax of employee 
	double	empincomeTax = salary * 12 * incomeTax;
	
	return empincomeTax;
	
	
		
	}
}
	
