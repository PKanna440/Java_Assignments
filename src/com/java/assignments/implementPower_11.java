package com.java.assignments;

public class implementPower_11 {

	public static void main(String[] args) {
		/* Implement pow(x, n), which calculates x raised to the power n (i.e., x n).

		Example 1:
		Input: x = 2.00000, n = 10
		Output: 1024.00000

		Example 2:
		Input: x = 2.10000, n = 3
		Output: 9.26100

		Example 3:
		Input: x = 2.00000, n = -2
		Output: 0.25000
		Explanation: 2

		-2 = 1/22 = 1/4 = 0.25
		*/
		
		float num = 2.00000f;
		int exp = -2;
		float powervalue = powr(num,exp);
		System.out.format("Output: %f",powervalue);
	}
	
		static float powr(float num, int exponent)
		{
			float result = 1;
			if (exponent ==0)
				return(1);
			else if(exponent <0)
			{
				exponent = -1*exponent;
				//System.out.println(exponent);
				for (int i = 1;i<=exponent;i++)
				{
				result = 1/powr(num, exponent); //1/1*2,1/2*2
				}
				return(result); 
			}
			else
			{
				for (int i = 1;i<=exponent;i++)
				{
				result = num*result; //1*2, 2*2, 4*2, 8*2
				}
				return(result);
			}
			
		}
	}
