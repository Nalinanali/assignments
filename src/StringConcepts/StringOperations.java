package StringConcepts;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StringOperations {

	public static void main(String[] args) {
		String name = " ( Username : Admin | Password : admin123 ) ";
		//Number of chars available with in the String --> string.length();
		System.out.println("Total Char's : "+name.length());
		//To get the char at specific index
		System.out.println(name.charAt(10));
		//to remove beginning and trailing spaces from string
		System.out.println(name);
		System.out.println(name.trim());
		//to get part of the String
		System.out.println(name.substring(14));
		System.out.println(name.substring(14,19));
		//Split string into multiple strings
		String [] values = name.split(" ");
		System.out.println(values[4]);
		System.out.println(values[8]);
		//Change the case of each char with in the string
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		//to join any two strings
		System.out.println(name.concat("| Role : QA "));
		//To Compare two strings
		String user1 = "Abc";
		String user2 = "ABC";
		String user3 = "Abc";
		System.out.println(user1.equals(user2));
		System.out.println(user1.equals(user3));
		System.out.println(user1.equalsIgnoreCase(user2));
		System.out.println(user1.equalsIgnoreCase(user3));
		System.out.println(user1.contains("AB"));
		System.out.println(user1.contains("Ab"));
		System.out.println(name);
		StringBuffer value = new StringBuffer("My Name Is Abc");
		value.append("| Role : QA ");
		System.out.println(value);
		String number = "100";
		System.out.println(number+100);
		//to convert text to number
		int num = Integer.valueOf(number);
		int num1 = Integer.parseInt(number);
		System.out.println(num1+100);
		//number to String
		String newValue = String.valueOf(num);
		System.out.println(newValue);
		//Type casting
		float percntage = 91.11231F;
		int marks =(int) percntage;
		System.out.println(marks);
		double newpercentage = (double) marks;
		System.out.println(newpercentage);
		//generate unique id using current date and time
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy hh:mm:ss");
		String uniqueid = sdf.format(Calendar.getInstance().getTime());
		System.out.println(uniqueid);
	}

}
