package com.java.assignments;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Assignment 1 – Data Types
		//1. Temperature of a city in degrees Celsius: 25.5
		
		float temp = 25.5f;
		//System.out.println(temp);		
		System.out.format("Temperature of a city in degrees Celsius:%.1f \n",temp);
		
		//2. Whether a customer has placed an order: true or false
		boolean answer = true;
		System.out.format("Customer has placed order:%b \n",answer);
		//System.out.println("Customer has placed order:"+answer);
		
		
		//3. Person's phone number: "123-456-7890"
		String phone_number="123-456-7890";
		System.out.format("Phone Number is:%s \n",phone_number);
		//System.out.println("Phone Number is:"+phone_number);
		
		//4. Amount of money in a customer's bank account: 1000.50
		
		float money = 1000.50f;
		System.out.println(money);		
		System.out.format("Amount of money in a customer's bank account:%.2f \n",money);
		
		//	5. Person's email address: "john.doe@example.com"
		
		String emailid = "john.doe@example.com";
		System.out.format("Person's email address:%s \n",emailid);
		
		
		//	6. Coordinates of a location (latitude, longitude): 37.7749, -122.4194
		
		double latitude = 37.7749d;
		double longitude = -122.4194d;
		System.out.printf("Latitude:" +latitude +" and Longitude:"  +longitude +"\n");
		
		// 	7. Person's marital status: true or false
		boolean status = false;
		System.out.printf("Person married:"+status +"\n");
		
		//  8. Person's occupation: "Software Engineer"
		String occupation = "Software Engineer";
		System.out.println("Person's occupation:"+occupation);

		//	9. Person's favourite colour: "Blue"
		String colour = "Blue";
		System.out.println("Person's favorite colour:"+colour);
		
		//	10.Current year: 2023
		short year = 2023;
		System.out.println("Current Year:"+year);
		
		//	11.Number of followers on a social media platform: 1,000,000
		int noof_followers = 1000000;
		System.out.format("Number of followers on a social media platform: %d \n", noof_followers );
		System.out.printf("Number of followers on a social media platform: %,d \n", noof_followers);
		
		//	12.Rating of a movie: 7.5
		float rating = 7.5f;
		System.out.println("Rating of Movie:"+rating);
		
		//	13.Person's blood type: 'A'
		char Bloodgroup = 'A';
		System.out.println("Person's Blood group is:"+Bloodgroup);
		System.out.printf("Bloodgroup is: "+ Bloodgroup +"\n");
		System.out.printf("Bloodgroup is:%s \n", Bloodgroup);
		System.out.format("Persons Bloodgroup :%s \n", Bloodgroup);
		
		//	14.Title of a book: "To Kill a Mockingbird"
		String title = "To Kill a Mockingbird";
		System.out.println("Title of a book:"+title);
		
		//	15.Number of employees in a company: 500
		short noof_emp = 500;
		System.out.printf("No of Employees:%d \n",noof_emp);
		
		//	16.Time of an event: 2:30 PM
		String time = "2:30 PM";
		System.out.print("Time of event:"+time+"\n");
		
		
		//	17.Name of a country: "United States"
		String country = "United States";
		System.out.println("Name of Country:"+country);
		
		//  18.Person's eye color: "Brown"
		String icolour = "Brown";
		System.out.printf("Person's Eye colour:%s \n",icolour); //throwing exception line 95
		
		//	19.Person's birthplace: "New York City"
		String place = "New York City";
		System.out.format("Person's birth place:"+place+"\n"); 
		

		//	20.Distance between two cities: 200.5
		float distance = 200.5f;
		System.out.println(distance);		
		System.out.format("Distance between two cities:%f \n",distance);
		/*
		int i = 10000;
		System.out.printf("%,d",i);
		
		System.out.format("Pi value is approximately %.2f", 3.142856);*/
		   
	}


	}
