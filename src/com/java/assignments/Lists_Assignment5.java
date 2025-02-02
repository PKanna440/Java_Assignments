package com.java.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Lists_Assignment5 {

	public static void main(String[] args) {
		//1. Create a list of the top 5 most populated countries in the world and print 2nd Country
		
		// First created a TreeMap so that the values are Sorted in Ascending order. 
		// Then created two Array List to store the Key and Key Values
		// Then fetched the Second ctry with highest population. 
		
		Map<Integer, String> countries = new TreeMap<Integer,String>();
		countries.put(1450935791,"India");
		countries.put(1419321278,"China");
		countries.put(211998573,"Brazil");
		countries.put(59342867, "Italy");
		countries.put(1335934867,"United States");
		
		System.out.println("\n**********Problem 1**********");
		//System.out.println(countries);
	    //System.out.println(countries.get(1419321278));
	   // System.out.println(countries.values());

		ArrayList<Integer> population = new ArrayList<Integer>(countries.keySet());
		//country = countries.keySet();
		//System.out.println(population);
		ArrayList<String> country = new ArrayList<String>(countries.values());
		//country = countries.keySet(); //if we declare here it is throwing error to cast it to Set<Integer>.. ?
		//System.out.println(country);
		
		int popl = population.get(3);
		String ctry = countries.get(population.get(3));
		
		System.out.println("Second Country with Highest population is: "+ctry +" with population: "+popl);
		
		// 2. Create a set of the top 10 most visited tourist attractions in the world and print out its size.
		
		// Creating TreeSet so that there are no null values. 
		
		System.out.println("\n**********Problem 2**********");
		
		Set<String> touristplaces = new TreeSet<String>();
		touristplaces.add("Agra");
		touristplaces.add("KanyaKumari");
		touristplaces.add("Paris");
		touristplaces.add("Italy");
		touristplaces.add("NewYork");
		touristplaces.add("Germany");
		touristplaces.add("Goa");
		touristplaces.add("Jaipur");
		touristplaces.add("France");
		touristplaces.add("Spain");
		
		System.out.println(touristplaces);
		System.out.println("Size of the Set is: "+touristplaces.size());
		
		// 3. Create a map of the 5 largest cities in the United States and their populations.
		
		// Creating a HashMap 
		
		System.out.println("\n**********Problem 3**********");
		
		Map<String, Integer> largecities = new HashMap<String, Integer>();
		largecities.put("Florida", 22610726);
		largecities.put("California", 38965193);
		largecities.put("Texas", 30965193);
		largecities.put("New York", 19571216);
		largecities.put("Pennsylvania", 12961193);
		
		System.out.println(largecities);
		
		ArrayList<String> largctry = new ArrayList<String>(largecities.keySet());
		ArrayList<Integer> largpop = new ArrayList<Integer>(largecities.values());
		
		System.out.println("Country        Population \n"+largctry.get(0) + "\t" +largpop.get(0));
		System.out.println(largctry.get(1) + "\t\t" +largpop.get(1));
		System.out.println(largctry.get(2) + "\t" +largpop.get(2));
		System.out.println(largctry.get(3) + "\t\t" +largpop.get(3));
		System.out.println(largctry.get(4) + "\t" +largpop.get(4));
		
		
		// 4. Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
		
		// Creating an Array
		
		System.out.println("\n**********Problem 4**********");
		int sum = 0;
		int[] numbers = new int[] {1,2,4,5,6,8,12,11,45,60};
		sum= numbers[2]+numbers[4];
		System.out.println("Size of array is:"+numbers.length);
		
		System.out.println("Sum of 3rd and 5th values is:"+sum);
		
		// 5. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		
		System.out.println("\n**********Problem 4**********");
		
		List <String> topmovies = new LinkedList<String>();
		topmovies.add("Bahubali");
		topmovies.add("Pushpa");
		topmovies.add("Gamechanger");
		topmovies.add("Titanic");
		topmovies.add("LuckyBhaskar");
		
		System.out.println("Third Movie: "+topmovies.get(2));
		//System.out.println("Third Movie: "+topmovies.);
		
	}

}
