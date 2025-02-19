package com.java.assignments;

public class Arrays_StoreIndex {

	public static void main(String[] args) {
		// Given values are 1,3,7,2,5
		// Store the index values in an Array when the total of two numbers is 9 

	//int num[] = {8,0,9,1,3,7,2,5};
			
	int num[] = {1,3,7,2,5};
	//int ind[] = new int[num.length];
	int [] ind = storeSumindex(num);
	
	for (int x:ind)
		System.out.println(x);
	}
	
	static int[] storeSumindex(int num[])
	{
	int result =0;
	int ind1[] = new int[num.length];
	int in =0;
	for(int i=0;i<num.length;i++)
	{
		for(int j = i+1; j<num.length; j++)
		{
			result = num[i]+num[j];
			if(result == 9 ) 
			{
				ind1[in] = i;
				ind1[in+1] = j;
				in = in +2 ;
			}
		}
	}
	return(ind1);
	}
}
