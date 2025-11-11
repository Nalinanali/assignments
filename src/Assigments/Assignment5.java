package Assigments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5 {

	public static void main(String[] args) {
		//Below student1Map details are stored using Map(HashMap)
		
		//Student1 details
		 Map<String, String> Student1Map = new HashMap<String,String>();
		 Student1Map.put("Name", "John Doe");
		 Student1Map.put("Age", "Twenty");
		 Student1Map.put("Gender", "Male");
		 Student1Map.put("Roll Number", "SBA12345");
		 Student1Map.put("Grade", "A++");
		 Student1Map.put("Major", "Computer Science");
		 Student1Map.put("GPA", "A3.8");
		 Student1Map.put("Email", "john@example.com");
		 Student1Map.put("PAN Number", "SDF6543210");
		 Student1Map.put("Address", "123 Elm St");
		    System.out.println("Student 1 details :" + Student1Map);
		    
		   //Student2 details 
		    Map<String, String> Student2Map = new HashMap<String,String>();
		    Student2Map.put("Name", "Jane Smith");
		    Student2Map.put("Age", "Twenty One");
		    Student2Map.put("Gender", "Female");
		    Student2Map.put("Roll Number", "SBA12346");
		    Student2Map.put("Grade", "B+");
		    Student2Map.put("Major", "Mathematics");
		    Student2Map.put("GPA", "A3.5");
		    Student2Map.put("Email", "jane@example.com");
		    Student2Map.put("PAN Number", "REW6543211");
		    Student2Map.put("Address", "456 Oak St");
		    System.out.println("Student 2 details :" + Student2Map);
		    
	        // Student 3  details
	        Map<String, String> Student3Map = new HashMap<String,String>();
	        Student3Map.put("Name", "Mike Brown");
	        Student3Map.put("Age", "Twenty Two");
	        Student3Map.put("Gender", "Male");
	        Student3Map.put("Roll Number", "SBA12347");
	        Student3Map.put("Grade", "A+");
	        Student3Map.put("Major", "Physics");
	        Student3Map.put("GPA", "A3.9");
	        Student3Map.put("Email", "mike@example.com");
	        Student3Map.put("PAN Number", "TYR6543212");
	        Student3Map.put("Address", "789 Pine St");
	        System.out.println("Student 3 details :" + Student3Map);
		    
	        List<Map<String, String>> StudentList = new ArrayList<Map<String, String>>();
	        StudentList.add(Student1Map);
	        StudentList.add(Student2Map);
	        StudentList.add(Student3Map);
	        
	        System.out.println("Student details:"+ StudentList);
	        
	        
	        //Emplyee details
	        
	        
	        Map<String, String> Employee1Map = new HashMap<String,String>();
	 //Add Employee1
	        Employee1Map.put("Employee ID", "E001");
	        Employee1Map.put("Name", "Alice Green");
	        Employee1Map.put("Age", "Thirty");
	        Employee1Map.put("Gender", "Female");
	        Employee1Map.put("Department", "Engineering");
	        Employee1Map.put("Position", "Software Engineer");
	        Employee1Map.put("Salary", "75K Pounds");
	        Employee1Map.put("Email", "alice@example.com");
	        Employee1Map.put("PAN Number", "SDF6543210");
	        System.out.println("Employee1 details:"+Employee1Map);

	        //  Add Employee 2
	        Map<String, String> Employee2Map = new HashMap<String,String>();
	        Employee2Map.put("Employee ID", "E002");
	        Employee2Map.put("Name", "Bob Johnson");
	        Employee2Map.put("Age", "Thirty Five");
	        Employee2Map.put("Gender", "Male");
	        Employee2Map.put("Department", "Marketing");
	        Employee2Map.put("Position", "Marketing Manager");
	        Employee2Map.put("Salary", "85K Pounds");
	        Employee2Map.put("Email", "bob@example.com");
	        Employee2Map.put("PAN Number", "REW6543211");
	        System.out.println("Employee2 details:"+Employee2Map);

	        // Step 5: Add Employee 3
	        Map<String, String> Employee3Map = new HashMap<String,String>();
	        Employee3Map.put("Employee ID", "E003");
	        Employee3Map.put("Name", "Carol White");
	        Employee3Map.put("Age", "Twenty Eight");
	        Employee3Map.put("Gender", "Female");
	        Employee3Map.put("Department", "Sales");
	        Employee3Map.put("Position", "Sales Executive");
	        Employee3Map.put("Salary", "65K Pounds");
	        Employee3Map.put("Email", "carol@example.com");
	        Employee3Map.put("PAN Number", "TYR6543212");
	        System.out.println("Employee3 details:"+Employee1Map);
	        
	        List<Map<String, String>> employeeList = new ArrayList<Map<String, String>>();
	        employeeList.add(Employee1Map);
	        employeeList.add(Employee2Map);
	        employeeList.add(Employee3Map);
	        
	        System.out.println("employeeList details:"+ employeeList);
	        
	        
	       //Product details
	        
	        Map<String, String> product1Map = new HashMap<String, String>();
	        product1Map.put("Product ID", "P001");
	        product1Map.put("Name", "Laptop");
	        product1Map.put("Category", "Electronics");
	        product1Map.put("Price", "12K Pounds");
	        product1Map.put("Stock Quantity", "Not Available");
	        product1Map.put("Supplier", "Tech Supplies");
	        product1Map.put("Warranty", "2 years");
	        product1Map.put("Rating", "4.5 Stars");
	        product1Map.put("Manufacturing Date", "Aug 2023");
	        product1Map.put("Expiry Date", "Aug 2028");
	        System.out.println("product 1 details:"+product1Map);
	        

	        // Add Product 2
	        Map<String, String> product2Map = new HashMap<String, String>();
	        product2Map.put("Product ID", "P002");
	        product2Map.put("Name", "Desk Chair");
	        product2Map.put("Category", "Furniture");
	        product2Map.put("Price", "150K Pounds");
	        product2Map.put("Stock Quantity", "Two");
	        product2Map.put("Supplier", "Office Depot");
	        product2Map.put("Warranty", "1 year");
	        product2Map.put("Rating", "4 Stars");
	        product2Map.put("Manufacturing Date", "Sep 2024");
	        product2Map.put("Expiry Date", "N/A");
	        System.out.println("product 2 details:"+product2Map);
	   
	        //  Add Product 3
	        Map<String, String> product3Map = new HashMap<String, String>();
	        product3Map.put("Product ID", "P003");
	        product3Map.put("Name", "Coffee Maker");
	        product3Map.put("Category", "Kitchen");
	        product3Map.put("Price", "75 Pounds");
	        product3Map.put("Stock Quantity", "Two Hundred");
	        product3Map.put("Supplier", "KitchenWorld");
	        product3Map.put("Warranty", "6 months");
	        product3Map.put("Rating", "4.2 Stars");
	        product3Map.put("Manufacturing Date", "Jan 2025");
	        product3Map.put("Expiry Date", "Jan 2027");
	        System.out.println("product 3 details:"+product3Map);
	        
	        
	        List<Map<String, String>>productList = new ArrayList<Map<String, String>>();
	        productList.add(product1Map);
	        productList.add(product2Map);
	        productList.add(product3Map);
	        System.out.println("productList details:"+ productList);
	
	        //To access all the data
	        Map<String,List<Map<String,String>>> data = new HashMap<String, List<Map<String,String>>>();
	        data.put("StudentData", StudentList);
	        data.put("EmployessData", employeeList);
	        data.put("ProductData", productList);
	        System.out.println("All the data list :"+ data);
	        System.out.println("*************************************************************************************************");
	        System.out.println("Supplier name of 2nd row of ProductData :"+data.get("ProductData").get(1).get("Supplier"));
	        
	        
	}

}
