package guvi_Assessment_4;

import java.util.Scanner;
import java.util.Stack;

public class StackExample {
	
	
//	To add Element into an stack 
	
	public void pushStack( Scanner sc , Stack<Integer> stack) {
		
		System.out.println("Enter Integer to push into stack:");
		int sk = sc.nextInt();
		
		stack.add(sk);
		
		
	}
	
//	To check the which element is at the top of the stack 
	
	public void popStack(Scanner sc , Stack<Integer> stack) {
		

		
		System.out.println("Poped Element is : " + stack.pop() );
		
	}
	
	
//	To check wheather the stack is emtpy or not  return boolean value 
	
	public void stackEmpty(Scanner sc , Stack<Integer> stack) {
		
		System.out.println("Is the Stack Empty ? T/F " + stack.isEmpty());
		
		
	}


	public static void main(String[] args) {
		
//	obj for Scanner class to take user input 
		Scanner sc = new Scanner (System.in);
		
		
//		Creating an obj for stack class 
		Stack <Integer> stack = new Stack<>();
		
		
//		Creating an obj for our class to run the methods in it 
		StackExample obj = new StackExample();
		
		
//		calling the methods using obj reference 
		
		obj.pushStack(sc, stack);
		obj.popStack(sc,stack);
		obj.stackEmpty(sc, stack);
		
		
		
		

	}

}
