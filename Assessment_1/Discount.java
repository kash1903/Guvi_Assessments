package guvi_Assessments.Assessment_1;


import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter your Amount for Discount: ");
		double Amount = obj.nextDouble();
		
		if(Amount <= 500) {
			System.out.println("Sorry No Discounts under 500 ");
		}
		
		else if(Amount > 500 && Amount <=1000 ) {
			
			double discountAmt = Amount * (10.0/100);
			double finalAmt = Amount - discountAmt;
			System.out.println("You got 10% discount  on " + Amount  + ","+ " Final Amount "+ finalAmt );
		}
		
		else if(Amount >1000) {
			double discountAmt = Amount * (20.0/100);
			double finalAmt = Amount-discountAmt;
			System.out.println("Your got 20% discount  on " + Amount + ","+ " Final Amount " + finalAmt);
		}
		
		
		obj.close();
		

	}

}
