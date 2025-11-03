package Assigments;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Assigment1 {

	public static void main(String[] args) {
		
//1. Temperature of a city in degrees Celsius: 25.5
		
		double temperature=25.5;
		System.out.println("1.Temperature of a city in degree celsius :"+temperature+"°C");
		
//2. Whether a customer has placed an order: true or false
		
		boolean hasPlacedOrder = true ;
	    System.out.println("2.Customer has placed an order."+hasPlacedOrder);
      
	  
// 3 . Person's phone number: "123-456-7890"
		
		String phoneNumber = "123-456-7890";
		System.out.println("3.Person's phone number:"+phoneNumber);

		
//4. Amount of money in a customer's bank account: 1000.50
		
		double accountBalance = 1000.50;
		System.out.println("4.Customer's bank account balance:" + accountBalance);
		
//5. Person's email address: "john.doe@example.com"
		
		String emailAddress = "john.doe@example.com";
        System.out.println("5.Person's email address: " + emailAddress);
// 6.Coordinates of a location (latitude, longitude): 37.7749, -122.4194
        
        double latitude = 37.7749;
        double longitude = -122.4194;
        System.out.println("6.Location latitude:"+latitude+ "and" + "Location latitude:"+longitude);
        
 // 7. Person's marital status: true or false
        
        boolean marital = false ;
	    System.out.println("7.Person's marital status:"+marital);
	    
//8.Person's occupation: "Software Engineer"
	    
	    String occupation = "Software Engineer";
	    System.out.println("8.Person's occupation: " + occupation);
	    
//9 Person's favourite colour: "Blue"
	    
	    String favouriteColour = "Blue";
        System.out.println("9.Person's favourite colour: " + favouriteColour);
        
// 10.Current year: 2023          
       int currentYear = 2023;
       System.out.println("10.Current year: " + currentYear);
    
 // 11.Number of followers on a social media platform: 1,000,000    
       
       long numberOfFollowers = 1_000_000;
       System.out.println("11.Number of followers: " + numberOfFollowers);
       
 // 12.Rating of a movie: 7.5
       
       double movieRating = 7.5;
       System.out.println("12.Rating of the movie: " + movieRating);
       
 //   13.Person's blood type: 'A'
       
       char bloodType = 'A';
       System.out.println("13.Person's blood type: " + bloodType);
       
 //  14.Title of a book: "To Kill a Mockingbird"
       
       String bookTitle = "To Kill a Mockingbird";
       System.out.println("14.Title of the book: " + bookTitle);
       
 //  15.Number of employees in a company: 500
       int numberOfEmployees = 500;
       System.out.println("15.Number of employees in the company: " + numberOfEmployees);
       
 //   16.Time of an event: 2:30 PM
       
       LocalTime eventTime = LocalTime.of(14, 30); // 2:30 PM in 24-hour format
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
       String formattedTime = eventTime.format(formatter);
       System.out.println("16.Time of the event: " + formattedTime);
       
 //    17.Name of a country: "United States"
       
       String country="United States";
       System.out.println("17.Name of a country: " + country);
       
  
 //     18.Person's eye color: "Brown"
       
       String  eyecolor= "Brown";
	   System.out.println("18.Person's eye color: " + eyecolor);
       
 //    19.Person's birthplace: "New York City"
	   
	   String  birthplace= "New York City";
	   System.out.println("19.Person's birthplace: " + birthplace);
	  
 //    20.Distance between two cities: 200.5     
	   
	   float distance= 200.5f;
	   System.out.println("20.Distance between two cities:"+ distance);
	    
	}

}
