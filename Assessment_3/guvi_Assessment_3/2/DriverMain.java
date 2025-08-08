package guvi_Assessment_3;

import java.util.Scanner;

public class DriverMain  {
	
	
	
	public void information(Scanner sc) {
		
//		Taking input from user 
		
		for(int i = 0 ;i <1;i++) {
			System.out.println("Enter Emp_ID");
			int empId= sc.nextInt();
			
			System.out.println("Enter Emp_Name");
			String name = sc.nextLine();
			sc.nextLine();
			
			System.out.println("Enter your Salary");
			double salary = sc.nextDouble();
			
			
			System.out.println("Enter Product_ID");
			int pid = sc.nextInt();
			
			System.out.println("Enter Price ");
			double price = sc.nextDouble();
			
			System.out.println("Enter Quantity");
			int quantity = sc.nextInt();
			
			
//			Object created for both Employee & Producet Class 
			Employee emp = new Employee(empId , name , salary);
			Product pdt = new Product (pid , price , quantity);
		
//			Printing Statement 
			System.out.println("Employee Income Tax: " + emp.calcTax());
			System.out.println("Product Sales Tax : " + pdt.calcTax());
			
				
		}
	
		
	}
	public static void main(String[] args) {
		
//		Scanner Class Obj 
		
		Scanner sc =  new Scanner (System.in);
		
        DriverMain obj = new DriverMain();
        
//        Calling the method
        obj.information(sc);
		

//		
		
		

	}

}
