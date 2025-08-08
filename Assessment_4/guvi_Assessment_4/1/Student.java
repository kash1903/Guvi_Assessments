package guvi_Assessment_4;

public class Student {
	
	
//	Attributes of Student Class 
	
	int rollNo;
	
	String name;
	
	int age;
	
	 String course;
	
	
//Contructor to Inilize value to the Attributes along with Custom Exception classes 

	public Student(int rollNo, String name , int age , String course) throws NameNotValidException, AgeNotWithinRangeException   {

		
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
		this.course=course;
		
//		Checks the valid Age 
		
		if(age < 15 || age >21) {
			throw new  AgeNotWithinRangeException("You are not Eligile for student Management System"); 
		}
		
		
//		Checks of Valid Name 
			
			if(!name.matches("[a-zA-Z\\s]+")) {
				throw new NameNotValidException("No Special Characters or Numbers Allowed");
			}
		
		
}

	public static void main(String[] args) {
	
            
		
//		Exceptional Handling 
		
		try {
			Student stu = new Student(101,"Manoj",11,"Java");
			
		} 
		
		catch (  AgeNotWithinRangeException e) {
			System.out.println(e);
		}
		catch(NameNotValidException e) {
			System.out.println(e);
		}
		
	
	}

}
