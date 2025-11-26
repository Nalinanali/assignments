package Assigments;

public class Assignment16_StringParagraph {

	public static void main(String[] args) 
	{
		String paragraph = "Java is a popular programming language. Java is used for web "
                + "development, mobile applications, and more.";
		 String[] words = paragraph.split(" ");
		String target = "Java";
        int count = 0;

        System.out.println("Indexes where '" + target + "' is found:");

        // Step 2 & 3: Search and print indexes
        for (int i = 0; i < words.length; i++) {

            // Remove punctuation like "." or ","
            String cleanWord = words[i].replaceAll("[^a-zA-Z]", "");

            if (cleanWord.equals(target)) {
                System.out.println(i);
                count++;
            }
        }

        // Print total occurrences
        System.out.println("\nTotal number of occurrences: " + count);
       
        
        
        for (int i = 0; i < words.length; i++) {
            System.out.println(i + " -> " + words[i]);
}
}
}
