package com.java.assignments;

public class Arrays_StoreIndex {

	public static void main(String[] args) {
		// Given values are 1,3,7,2,5
		// Store the index values in an Array when the total of two numbers is 9 

	int num[] = {8,0,9,1,3,7,2,5};
	System.out.println("Size of array is:" +num.length);
	//int ind[] = new int[10];
	//int num[] = {1,3,7,2,5};
	int ind[] = new int[10];

	int result =0;
	int in =0;
	for(int i=0;i<num.length;i++)
	{
		for(int j = i+1; j<num.length; j++)
		{
			result = num[i]+num[j];
			if(result == 9 ) 
			{
				ind [in] = i;
				ind[in+1]= j;
				in = in+1;
			}
		}
	}
	
	//for(int m:ind)
	//	System.out.println(m);
	
	for(int n=0;n<ind.length;n++)
	{
		//if(ind[n]>0)
			System.out.println(ind[n]);
	}
}
}
