package guvi_Assessment_3;

import java.util.Scanner;

import guvi_Assessment_2.Product;

public class Library {
	
	
//	Add Book method to add book in the Library 
	
	public void addBook(Scanner sc , Book [] books) {
		

		for(int i = 0 ; i<books.length;i++) {
			
		
		if (books [i] == null)  {
			
			System.out.println("Enter your Book id :");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Book Title :");
			String title = sc.nextLine();
			sc.nextLine();
			
			System.out.println("Enter your Book Author");
			String author = sc.nextLine();
			
			boolean isAvailable = true;
			
		
			
			books [i] = new Book ( id ,  title ,  author, isAvailable);
				
				
				System.out.println("--------------------------------");
				
				break; 
		}
		
		}
		
		
		System.out.println("Your Book has been successfully Added ! ");
		
	}
	
//	To see the book in the Library 
	
	public void displayBooks(Book [] books) {
		
		   System.out.println("--------------------------------");
		  
		
		for( int i = 0 ; i <books.length ; i++ ) {
			   if(books[i] != null) {
					System.out.println("Book ID :" + books[i].getbookId());
					System.out.println("Book Title : " + books[i].getTitle());
					System.out.println("Book Author : " + books[i].getAuthor());
					
					if(books[i].getIsAvailable() == true) {
				
						System.out.println("Book Available : " + "Yes");
					}
					else {
						System.out.println("Book Available : " + "No");
					}
					
					System.out.println("--------------------------------");
			   }

		}
		
		System.out.println("----------------> End of List <--------------- ");
		
	}
	
	
//	To remove the book from the library 
	
	public void deleteBook(Book[] books) {
		System.out.println("--------------------------------");
		
		Scanner sc2 = new Scanner (System.in);
		
		System.out.println("Please Enter the Book_ID");
		
		int id = sc2.nextInt();
		
		boolean available = true;
		
   
		for (int i =0 ; i < books.length-1; i++) {
			
			if( books[i] != null && books[i].bookId == id ) {
				
//				 available = false;
				books[i].isAvailable = false;
				 
//			 Shifting Element as we cannot directly remove the element from an array 
//				 for (int j = i ; j< books.length-2;j++) {
//					 
//					 books[j] = books[j+1];
//					 
//					 // setting last element to null to remove it 
//					 books[books.length-1] = null;
//					 
//					 System.out.println("Book Removed successfully");
//					 break;
//				 }
				 
				 	}
			 else {
				 System.out.println("Book Removed Successfully");
				 break;
			 }

			
		}
		
		
	}
	
//	To find the book in the Library 
	
	
	public void searchBooks(Book[] books) {
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the book name :");
		
		String bookName = sc2.nextLine();
		sc2.nextLine();
		
		for(int i =0 ; i < books.length; i++) {
			
			if(books[i] == null) {
	
				continue;
			}
			
			if( books[i] != null&& books[i].title.equalsIgnoreCase(bookName) ) {
				System.out.println("The book is Available");
				System.out.println("Book ID " + books[i].getbookId());
				System.out.println("Book Title : " + books[i].getTitle());
				System.out.println("Book Author : " + books[i].getAuthor());
				
			}
			
//			else {
//				System.out.println("Book is not Available in the Library");
//			}
			
		}
	}
	
	
	

	public static void main(String[] args) {
		
//		Main Class for Creating Object for the Library class 
		
         Library obj = new Library();
         
		Book [] books = new Book[10];
		
		Scanner sc = new Scanner (System.in);
		
		int i = 0;
		
		while(i==0) {
			
			Scanner sc1 = new Scanner (System.in);
			System.out.println("--------------------------------");
			System.out.println("Welcome to the Library");
			System.out.println("Press 1 to Add your Book");
			System.out.println("Press 2 to See your Books");
			System.out.println("Press 3 to Delete your Book");
			System.out.println("Press 4 to Search your Book");
			System.out.println("Press 5 to EXIT Library");
			System.out.println("--------------------------------");
			
			int number = sc1.nextInt();
			
			switch(number) {
			
			case 1 :   obj.addBook(sc, books);
			break;
			
			case 2 :   obj.displayBooks(books);
			break;
			
			case 3 :  obj.deleteBook(books);
				break;
				
			case 4: obj.searchBooks(books);
				break;
				
			case 5: i++;
			break;
			
			default: System.out.println("Please Enter an Valid Number ");
			}
			
			
		}
		
		System.out.println("-------------------------------------------------");
		System.out.println("Thank you for using our Library Mangement System ");
		System.out.println("See you next Time !!");
		
		
		
		
	}

}
