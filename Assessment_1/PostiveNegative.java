package guvi_Assessments.Assessment_1;

import java.util.Scanner;


public class PostiveNegative {

	public static void main(String[] args) {
		
		
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter your Number:");
		
	     int Number = obj.nextInt();
		
	     if(Number > 0) {
	    	 System.out.print("Positive");
	     }
	     
	     else if(Number < 0) {
	    	 System.out.print("Negative");
	     }
	     
	     else {
	    	 System.out.print(" Your Number is Zero");
	     }
		
	     
	     
		obj.close();

	}

}
