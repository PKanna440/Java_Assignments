package com.java.assignments;

public class Arrays_BuySell_10 {

	public static void main(String[] args) {
		/* Best Time to Buy and Sell Stock
		You are given an array prices where prices[i] is the price of a given stock on the ith day.
		You want to maximize your profit by choosing a single day to buy one stock and choosing
		a different day in the future to sell that stock.
		Return the maximum profit you can achieve from this transaction. If you cannot achieve
		any profit, return 0.

		Example 1:
		Input: prices = [7,1,5,3,6,4]
		Output: 5
		Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
		Note that buying on day 2 and selling on day 1 is not allowed because you must buy
		before you sell.
		Example 2:
		Input: prices = [7,6,4,3,1]
		Output: 0
		Explanation: In this case, no transactions are done and the max profit = 0.
		*/
		
		/* Approach:
		 * Find if the smallest value to buy is at the end of the array. If so we can't do any transactions. 
		 * Else, 
		 * Store the index of smallest price in an array. this is the best day to buy. 
		 * Next, find the largest value in the array next to smallest value. 
		 * Store the index of largest value in the above array. 
		 * When the largest value is after the smallest value perform the required calculations. 
		 */
		
		int prices[] = {7,1,5,3,6,4};
		//int prices[] = {7,6,4,3,1}; //data set 2
		//int prices[] = {8,2,5,4,6,9,10,1}; //data set 3 
		//int prices[] = {18,17,15,4}; 
		int ri =0;
		int result[] = new int[prices.length];
		int days[] = new int[2];
		
		for(int i=0;i<prices.length;i++)
		{
			result[i] = prices[i];
		}
		
		System.out.println("++++++++Below is the Initial Prices Array++++++++");
		
		for (int m:result)
			System.out.println(m);
		
		System.out.println("++++++++Below is Sorted Array++++++++");
		
		for(int l=0;l<result.length;l++)
		{
			for(int k = l+1; k<result.length; k++)
			{
				if(result[l]>result[k]) {
					ri = result[l];
					result[l] = result[k];
					result[k] = ri;
				}
			}
		}
		for (int m:result)
			System.out.println(m);
		for (int n=0; n<result.length;n++)
		{
			if (result[0] == prices[n])
				days[0] = n;
		}
		
		for (int n=0; n<result.length;n++)
		{
			if (result[n] == prices[n] && n> days[0])
				days[1] = n;			
		}
	
		System.out.println("++++++++Below is Days Array++++++++");
		
		for (int m:days)
			System.out.println(m);
		
		System.out.println(prices[days[1]]);

		if ( days[0] > days[1] )
			System.out.println("No Transactions can be done");
		else 
		{
			int bestbuydayvalue = prices[days[0]];
			int bestselldayvalue = prices[days[1]];
			System.out.println("best buy "+bestbuydayvalue + " bestselldayis:" +bestselldayvalue);
			int profit = bestselldayvalue - bestbuydayvalue;
			System.out.println(bestselldayvalue);
			System.out.println("Best time to Buy is:Day " +(days[0]+1));
			System.out.println("Best time to Sell is:Day " +(days[1]+1));
			System.out.println("Maximum Profit = " +profit);
		}
		
	}
}
	
