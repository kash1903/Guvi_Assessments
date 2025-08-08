package guvi_Assessments.Assessment_1;

import java.util.Scanner;


public class SmallestAmong3 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter First Number ");
		int n1= obj.nextInt();
		
		System.out.println("Enter Second Number");
		int n2= obj.nextInt();
		
		System.out.println("Enter Third Number");
		int n3= obj.nextInt();

		
		if(n1>n2 && n1>n3) {
			System.out.println(n1 + " is greatest");
		}
		
		else if(n2>n1 && n2>n3) {
			System.out.println(n2 + " is greatest");
		}
		
		else {
			System.out.println(n3 + " is greatest")	;
		}
		
		obj.close();
	}

}
