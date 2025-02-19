package com.java.assignments;

public class primeNumber_12 {

	public static void main(String[] args) {
		/* Given a number n, determine whether it is a prime number or not. A prime number is a
		number greater than 1 that has no positive divisors other than 1 and itself.

		Examples :

		Input: n = 7
		Output: true
		Explanation: 7 has exactly two divisors: 1 and 7, making it a prime number.

		Input: n = 25
		Output: false
		Explanation: 25 has more than two divisors: 1, 5, and 25, so it is not a prime number.

		Input: n = 1
		Output: false
		Explanation: 1 has only one divisor (1 itself), which is not sufficient for it to be considered
		prime.
		*/
		
		int n = 10250;
		//boolean output;
		int counter = 0;
		
		for (int i = n; i>=1;i--) 
		{
			if(n%i == 0)
				counter++;
		}
		
		if (counter>2)
			System.out.println(false);
		else if(counter == 1)
			System.out.println("Not Eligible for Prime");
		else if(counter == 0)
			System.out.println("Not valid to check for Prime");
		else
			System.out.println(true);

	}

}
