package guvi_Assessment_4;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapManupulation {
	
	
	
	public void addStudent(Scanner sc,HashMap<String,Integer> map) {
		

			sc.nextLine();
			
			System.out.println("Enter Student_Name:");
			String key =sc.nextLine();
			
			System.out.println("Enter Student_Marks");
			int value =   Integer.parseInt(sc.nextLine());
			
			map.put(key, value);
			System.out.println("Student Successfully Added")	;
			
			
		
				
	}
	
//	Genral Method to display the HashMap 
	
	public void displayStudent(HashMap<String,Integer> map) {
	
	for(String student: map.keySet()) {
	
	System.out.println(student + "=>" + map.get(student));
}
	
}
	

	
	

//	Method to remove Student from the map 
	
	public void removeStudent( Scanner sc ,HashMap<String,Integer> map) {
		
		
		
		sc.nextLine();
			System.out.println("Enter Student_Name to remove");
			String key = sc.nextLine();
			
			map.remove(key);
				
			System.out.println("Student has been successfully removed from the Map ");
	}
	
	

	
//	To display Student grade by their name 
	
	public void displayGradeByName(Scanner sc ,HashMap<String,Integer> map) {
		
		
		
			sc.nextLine();
			System.out.println("Enter Student_Name to display Grade ");
			String key = sc.nextLine();
			
			
			System.out.println("Student Name: " + key + "-" + map.get(key) + " Marks");
			
			
		
		
	}
	
	

	public static void main(String[] args) {
		
		HashMap <String,Integer> hm = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		HashMapManupulation obj = new HashMapManupulation();
		
		hm.put("Mano", 89);
//		hm.put("Harish", 78);
//		hm.put("Varun", 67);
		
		
		int i = 1;
		
	while(i!=0) {
		
		System.out.println("---------------------------------------------");
		System.out.println("Welcome to HashMap Manupulation ! ");
		
		System.out.println(" ");
		
		System.out.println("Press 1 to Add Student to HashMap");
		System.out.println("Press 2 to Display Student in HashMap");
		System.out.println("Press 3 to Remove Student from HashMap");
		System.out.println("Press 4 to find Grade by Student Name ");
		System.out.println("Press 5 to EXIT ");
		
		System.out.println("Please tell us what you want to do ? ");
		int number = sc.nextInt();
		
		switch(number) {
		
		case 1 : 	obj.addStudent(sc, hm);
		break;
		
		case 2 :   obj.displayStudent(hm);
		break;
		
		case 3 :   obj.removeStudent(sc, hm);
		break;
		
		case 4 :  obj.displayGradeByName(sc, hm);
		break;
		
		case 5 : i--;

		}
		
		
		
		
	}
	
	
		
		
		
		
		


	}

}
