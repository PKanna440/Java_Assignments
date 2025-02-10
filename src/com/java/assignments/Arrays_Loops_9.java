package com.java.assignments;

public class Arrays_Loops_9 {

	public static void main(String[] args) {
		//Given values are 12 ,34,11,36,87,98,93.
		//Store the values in Array and Print second and third largest number from the above values without
		//using collections and default sort methods

	int num[] = {12 ,34,11,36,87,98,93};
	
	int result =0;
	
	for(int i=0;i<num.length;i++)
	{
		for(int j = i+1; j<num.length; j++)
		{
			if(num[i]>num[j]) {
				result = num[i];
				num[i] = num[j];
				num[j] = result;
			}
		}
	}
	
	// Check if the array is sorted as expected. 
	/* System.out.println("Sorted Array in Ascending Order is:");
		for(int m:num)
			System.out.println(m);
	*/
	System.out.println("Second Largest Number from the above Array is:" + num[(num.length-1)]);
	
	System.out.println("Third Largest Number from the above Array is:" + num[(num.length-2)]);
	
	
	}

}
