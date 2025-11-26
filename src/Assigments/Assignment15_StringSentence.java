package Assigments;

public class Assignment15_StringSentence {

public static void main(String[] args) {
		
		    String sentence = "Java programming is fun and challenging";
		
//1. Count the total number of words in the sentence.
				  
		  // Split sentence by spaces
	        String[] words = sentence.split(" ");
	        // Count words
	        int wordCount = words.length;

	        System.out.println("Total number of words: " + wordCount);
	        
//2. Print the sentence words in reverse order.
	        
	        System.out.println("Words in reverse order:");
	        
	        // Print words in reverse order
	        for (int i = words.length - 1; i >= 0; i--) 
	        {
	            System.out.print(words[i] + " ");
	        }
	        
	        
//	3. Convert the first character of each word to uppercase and print original sentence	        
	        StringBuilder result = new StringBuilder();

	        
	        for (String word : words) {
	            // Capitalize first letter + rest of the word
	            String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1);
	            result.append(capitalized).append(" ");
	        }

	        // Print final sentence
	        System.out.println("\n"+result.toString().trim());
	        
	        

	}

}
