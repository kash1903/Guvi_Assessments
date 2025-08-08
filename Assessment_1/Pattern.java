package guvi_Assessments.Assessment_1;

public class Pattern {

	public static void main(String[] args) {
			/*
			 5 5 5 5 5
			 5 4 4 4 4
			 5 4 3 3 3
			 5 4 3 2 2
			 5 4 3 2 1
			 	
			 */
		
		
    int n = 5;
        
        for(int i = 1; i <= n; i++) {
            int num = 5;
            
            // First part: print decreasing numbers
            for(int j = 1; j <= i; j++) {
                System.out.print(num-- + " ");
            }
            
            // Second part: repeat last number
            for(int j = i + 1; j <= n; j++) {
                System.out.print((num + 1) + " ");
            }
            
            System.out.println();
        }
		
		
		

	}

}
