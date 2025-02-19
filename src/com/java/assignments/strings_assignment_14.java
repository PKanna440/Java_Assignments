package com.java.assignments;

import java.util.ArrayList;
import java.util.List;

public class strings_assignment_14 {

	public static void main(String[] args) {
		/* Write a program to perform the following tasks:
		1. Count the total number of words in the sentence.
		2. Print the sentence words in reverse order.
		3. Convert the first character of each word to uppercase and print original sentence

		Input is: String sentence = "Java programming is fun and challenging";
		 */
		
		String sentence = "Java programming is fun and challenging";
		
		String [] words = sentence.split(" ");
		System.out.format("Total no.of Words in the Sentence are: %d \n\n",words.length);
		
		System.out.println("Sentence words in reverse order as below:");
		
		//for(int i =words.length-1; i>=0; i--)
			//System.out.println(words[i]);
		
		for(int i =words.length-1; i>=0; i--)
		{
			System.out.format(words[i] + " ");
		}
		System.out.println("\n");
	//	char [] temp = words[0].toCharArray();
	//	System.out.println(words[0].charAt(0));
		
	//	char [] temp = words[0].toCharArray();
	//	System.out.println(temp);
		
		// Changing First character of word to Uppercase
		System.out.println("Sentence with Uppercase at the begining of the word as below:");
		for(int i =0; i<words.length; i++)
		{
		String temp = "";
		String temp1 = "";
		temp = temp+words[i].charAt(0);
		temp1 = temp.toUpperCase();
		words[i] = words[i].replace(temp, temp1);
		System.out.format(words[i]+ " ");
		}
		System.out.println("."+"\n");
		
		/* Assignment: Write a program to search for all occurrences of a “Java” word in the paragraph and print their indexes.
		 * 1. Divide into multiple words
		 * 2. Find total number of occurrences
		 * 3. Print count and Indexes of the word 
		 * String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		 */
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		
		//boolean result = paragraph.contains("Java");
		
		//System.out.println(result);
		String [] words1 = paragraph.split(" ");
		
		/*for(int i =0; i<=words1.length-1; i++)
		{
			System.out.format(words1[i]+" ");
		}
		System.out.println();
		*/
		int count =0;
		
		List<Integer> result1 = new ArrayList<Integer>();
		
		for (int d = 0;d<words1.length;d++)
		{
			if(words1[d].contains("Java"))
			{
				count = count+1;
				result1.add(d);
			}
		}
		System.out.println("No.of occurences: "+count);
		System.out.print("Indexes are: ");
		System.out.println(result1+"\n");
		
		/* Write a program to print * in triangle pattern
		 * 1. If I will pass int rows = 5 then it should print triangle with 5 Rows
		 * b- loop when set as b<=rows is giving right triangle. 
		 */
		System.out.println("Print Pattern");
		int rows =5;
		for (int a = 1; a<=rows; a++) {
			for (int b = 1; b<=rows-a; b++)	{
				System.out.print(" ");
				}
			for (int m = 1; m<=a; m++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
