package Assigments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment4 {

	public static void main(String[] args) {

/*1.Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th
	cities combined.*/
		// Create a List for city names
        List<String> cities = new ArrayList<>();
        cities.add("New York");//0  ->1st city
        cities.add("Tokyo");//1  ->2nd city
        cities.add("Chicago");//2 ->3rd city
        cities.add("Houston");//3   ->4th city
        cities.add("Los Angeles");//4 ->5th city

        // Create a List for their areas (in square kilometers)
        List<Double> areas = new ArrayList<>();
        areas.add(783.8);
        areas.add(2194.0);
        areas.add(606.1);
        areas.add(1651.1);
        areas.add(1302.0);

        // Calculate total area of 3rd and 4th cities (index 2 and 3)
        double totalArea = areas.get(2) + areas.get(3);

        // Print result
        System.out.println("Total area of " + cities.get(2) + " and " + cities.get(3) +
                           " combined is: " + totalArea + " sq km");
	



/*2.Create a set of the top 10 most visited tourist attractions in the world and print out all
of them and its size.*/
	Set<String> attractions = new HashSet<>();

    // Add attractions to the set
    attractions.add("Eiffel Tower");
    attractions.add("Great Wall of China");
    attractions.add("Statue of Liberty");
    attractions.add("Machu Picchu");
    attractions.add("Taj Mahal");
    attractions.add("Colosseum");
    attractions.add("Grand Canyon");
    attractions.add("Disneyland");
    attractions.add("Times Square");
    attractions.add("Pyramids of Giza");

    // Print all tourist attractions
    System.out.println("Top 10 Most Visited Tourist Attractions in the World:");
    System.out.println(attractions);

    // Print size of the set
    System.out.println("\nTotal number of attractions: " + attractions.size());
    
    
 /*3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and
6th Value.*/
    
 // Create an array of 10 numbers
    int[] numbers = {12, 25, 37, 49, 56, 68, 74, 83, 91, 100};
    double average = (numbers[4] + numbers[5]) / 2.0;
    System .out.println("\nAverage of 5th and 6th Value:"+ average);
    
  /*4. Create a list of the top 5 highest-grossing movies of all time and print out the third
movie on the list. */ 
    
    // Create a list of top 5 highest-grossing movies
    List<String> movies = new ArrayList<>();
    movies.add("Avatar");
    movies.add("Avengers: Endgame");
    movies.add("Titanic");
    movies.add("Star Wars: The Force Awakens");
    movies.add("Avengers: Infinity War");

    // Print the third movie (index 2 since index starts from 0)
    System.out.println("The third highest-grossing movie of all time is: " + movies.get(2));
}
}
