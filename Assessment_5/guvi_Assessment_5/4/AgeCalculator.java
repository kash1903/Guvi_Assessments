package guvi_Assessment_5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class AgeCalculator {
	
	

	public static void main(String[] args) {
    
//		Taking user input from the user 
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your Date in DOB");
		int date = sc.nextInt();
		
		System.out.println("Enter your Month in DOB");
		int month = sc.nextInt();
		
		System.out.println("Enter your year in DOB");
		int year = sc.nextInt();
		
		
//		Getting the DOB of the user 
		LocalDate birthday = LocalDate.of(year, month, date);
		
//		Finding the Today's date  using LocalDate 
		LocalDate today  = LocalDate.now();
		
		
//		Finding the differnce between These 2 dates 
		Period p = Period.between(birthday, today);
		
		
		
//		Printing the dates with getmehtods
		System.out.println("You are " + p.getYears() + " Years " + p.getMonths() + " Months " + p.getDays() + " Days Old ");
//		System.out.println("Year: " + p.getYears());
//		System.out.println("Months: " + p.getMonths());
//		System.out.println("Days: " + p.getDays());
		

		
		
		
		
		
		
	}

}
