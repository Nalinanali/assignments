package Assigments;

public class EmpGroups {

	public static void main(String[] args) {
	
		Employees emp = new Employees();

        // Create arrays to store names and IDs
        String[] empNames = {emp.empName1, emp.empName2, emp.empName3};
        int[] empIDs = {emp.empID1, emp.empID2, emp.empID3};
        
     /*   Retrieve the data from the Employees class, store it in these arrays, and finally print each employee's
        name along with their corresponding ID.*/
	
        
        System.out.println("Employee Name: " + emp.empName1 + ", Employee ID: " + emp.empID1);
        System.out.println("Employee Name: " + emp.empName2 + ", Employee ID: " + emp.empID2);
        System.out.println("Employee Name: " + emp.empName3 + ", Employee ID: " + emp.empID3);

	}
}
