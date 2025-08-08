package guvi_Assessment_4;

import java.util.Scanner;


public class WeekDays {
	
	public static void main(String[] args) {
		
		
//		Scanner Obj to take user input 
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter any Number B/W 0-6");
		
		int number = sc.nextInt();
		
		
//		Array with Weekdays name in it 
		String Weekdays [] = {"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		
//		Try catch block to handle ArrayIndexOutOfBoundException 
		
		try {
			System.out.println("Day is : " + Weekdays[number]);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please Enter number b/w 0 & 6 ");
		}
				

		
		

		
		
		
		
		
		
		

	}

}
