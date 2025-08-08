package guvi_Assessment_2;

import java.util.Scanner;

public class ProductMain {
	
//	Accepting 5 Products from the user 
	
	public void acceptProduct(Product [] products,Scanner sc ) {
		
		for(int i = 0 ; i<5 ; i++) {
			
			System.out.println("Enter your Product id " + "for product number " +  i);
			int id = sc.nextInt();
			System.out.println("Enter your Price " + "for product number " + i);
			int price = sc.nextInt();
			System.out.println("Enter your Quantity for product number " + i );
			int quantity = sc.nextInt();
			
			products[i] = new Product(id, price, quantity);
		}
		
		System.out.println("Your Items have been submitted");
		
	}
	
//	Finding the Highest Price id 
	
	public static int highestPriceId(Product [] products) {
		
		// consider max price as current price for understanding 
		
		int maxPrice =products[0].price;
		
		int pid = products[0].id;
		
//		int qty=products[0].quantity;
		
		for (int i = 0; i < products.length; i++) {
			
			
			if(products[i].price > maxPrice) {
				
				maxPrice = products[i].price;
				
				pid = products[i].id;
				
			}	
		}
		
		return pid;
	}
	
	
	public static int totalProductPrice(Product [] products) {
		

		int quantiyty=products[0].quantity;
		int totalPrice =0;

		for(int i =0; i< products.length;i++) {

		   totalPrice = totalPrice + (products[i].price * products[i].quantity);
				
		}
		return totalPrice;
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product [] products = new Product[5];
		
		ProductMain obj  = new ProductMain();
		
		obj.acceptProduct(products, sc);
		
		int higestPriceId = highestPriceId(products);
		
		System.out.println("Higest Price id is : " + higestPriceId);
		
		int totalPrice = totalProductPrice(products);
		
		System.out.println("Total Price = " + totalPrice);
		
		
		
		
		

	}

}
