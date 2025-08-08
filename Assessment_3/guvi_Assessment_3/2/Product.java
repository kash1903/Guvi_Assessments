package guvi_Assessment_3;

public class Product implements Taxable{
	
//	Product class Attibutes 
	
	int pid;
	double price;
	int quantity;
	
//	Parameterised Constructor 
	
	public Product (int pid, double price, int quantity ) {
		
		this.pid = pid;
        this.price= price;
        this.quantity= quantity;
	}
	


//	Abstract Method Implemented 
	
	@Override
	public double calcTax() {
		
		double pdtsalesTax = price * salesTax;
		
		return pdtsalesTax;
		
		
	}

}
