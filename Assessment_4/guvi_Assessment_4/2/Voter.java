package guvi_Assessment_4;

public class Voter {
	
//	Attributes of Voter Class 
	
	int voterId;
	String name;
	int age;
	
//	Parameterised Contructor of Voter
	
	public Voter( int voterId,String name , int age) throws ArithmeticException {
    
		this.voterId=voterId;
		this.name=name;
		this.age=age;
		
//		Condition of Age
		if(age<18) {
			
//			Thowing UncheckedException 
			
			throw new ArithmeticException("invalid age for voter");
			
		}
	}

	public static void main(String[] args) {
		
//		Creating obj for Voter Class 
		
		Voter v = new Voter (111, "Harish", 17);
              
              
	}

}
