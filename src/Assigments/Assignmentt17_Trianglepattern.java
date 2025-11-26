package Assigments;

public class Assignmentt17_Trianglepattern {

	public static void main(String[] args) {
		
		 int rows = 5; 

	        for (int i = 1; i <= rows; i++) {
	            // Print stars for each row
	        	
	        	// Print spaces
	            for (int s = 1; s <= rows - i; s++) {
	                System.out.print(" ");
	            }

	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println(); // move to next line
	        }

	}

}
