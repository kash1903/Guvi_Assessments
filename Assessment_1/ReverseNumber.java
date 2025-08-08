package guvi_Assessments.Assessment_1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
    
		
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter your Number:");
		int Number = obj.nextInt();
		
		int rev=0;
		
		while(Number!=0) {
			
			int digit  = Number%10 ;
			rev= rev * 10 + digit;
			Number = Number /10;
			

		}
		
		System.out.println("Reverse:" + rev);
		
       
		obj.close();
	}

}
