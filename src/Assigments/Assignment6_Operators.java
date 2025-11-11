package Assigments;

public class Assignment6_Operators {

	public static void main(String[] args) {

/*Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
marks [75, 80, 82] Add 10 marks to each students using assignment operators and
store it into another array, after adding 10 marks identify the average marks of all
students*/
		
		String[] studentNames = {"Suresh", "Mahesh", "Naresh"};
        int[] marks = {75, 80, 82};

        // Step 2: Create another array to store updated marks
        int[] updatedMarks = new int[marks.length];

        // Step 3: Add 10 marks using assignment operator and store in updatedMarks
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 10;  // add 10 marks
            updatedMarks[i] = marks[i];  // store updated mark
        }

        // Step 4: Calculate average
        int total = 0;
        for (int mark : updatedMarks) {
            total += mark;
        }
        double average = (double) total / updatedMarks.length;

        // Step 5: Print results
        System.out.println("Updated Student Marks:");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i] + " : " + updatedMarks[i]);
        }

        System.out.println("\nAverage Marks after adding 10: " + average);
	}

}
