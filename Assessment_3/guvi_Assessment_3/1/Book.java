package guvi_Assessment_3;

public class Book {
	
	
	
//	Initilizing Attributes of Book Class 
	
	 int bookId;
	
     String title;
	
	String author;
	
	boolean isAvailable;
	
	
//	Parameterised Constructor of Book Class 
	
	public Book (int bookId, String title , String author , boolean isAvailable) {
		
		this.bookId = bookId;
		this.title = title ;
		this.author = author;
		this.isAvailable = isAvailable ;	
		
	}
	
//	Getter methods to get/ use them in library Class 
	
	public int getbookId() {
		return bookId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public boolean getIsAvailable() {
		return isAvailable;
	}
	
	

}
