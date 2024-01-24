/* Perfect Number */
/* If sum of the factors of the given number is equal to the given number, then it is a perfect number */
/* 6 -> 1+2+3 = 6 */

import java.lang.*;
import java.util.*;

class Perfect
{
	public static void myFun(int n) //n=6
	{
		int m=n, sum=0; //m=6

		for(int i=1;i<n;i++)
		{
			if(m%i==0) //6%1=0, 6%2=0, 6%3=0, 6%4!=0, 6%5!=0
			{
				sum = sum + i;
			}
				
		}
		if(sum == n)
		{
			System.out.println(n+" is a perfect number");
		}
		else
		{
			System.out.println(n+" is not a perfect number");
		}
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);	
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		Perfect.myFun(n);
	}
}