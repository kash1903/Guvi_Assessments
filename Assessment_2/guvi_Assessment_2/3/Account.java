package guvi_Assessment_2;

import java.util.Scanner;

public class Account {
	
//	Data member balance 
	
	int  balance;
	
//	Default constructor 
	
	public  Account() {
		balance = 0;
		}
	
//	Parameterised Constructor
	
	public Account (int  balance) {
		
		this.balance = balance ;
		
	}
	
//	To Deposit Amount 
	public void depositAmount(Scanner sc) {
		
		
		System.out.println("Enter your Amount to Deposit ");
		int  Amount = sc.nextInt();
		balance = balance + Amount ;
		System.out.println("Amount Successfully added ");
	}
    
//	To withdraw Amount 
	public void withdrawAmount( Scanner sc) {
//		Scanner obj2 = new Scanner(System.in);
		System.out.println("Enter Amount to Withdraw");
		int Amount = sc.nextInt();
		
		if(Amount > balance ) {
			System.out.println("You don't have enough cash in your Account !" );
		}
		else {
			
			System.out.println("Collect your Cash ");
			balance = balance - Amount ;
		}
		
	}
	
//	To Display Balance 
	public void displayBalance() {
		
		System.out.println("Your Balance is :" + balance);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Account obj = new Account ();
		
		obj.depositAmount(sc);
		obj.withdrawAmount(sc);
	    obj.displayBalance();
	    
	
	}

}
