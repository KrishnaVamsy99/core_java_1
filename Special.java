/* Special Number */
/* Sum of factorial of digits is equal to the given number*/
/* 145 = 1! + 4! + 5! -> 1+24+120 ->145. */

//import java.lang.*;
import java.util.*;

class Special
{
	public static int factorial(int n)
	{
		int fact=1;

		if(n==0)
		{
			return 1;
		}
		else
		{
			
			for(int i=n;i>=1;i--)
			{
				fact = fact*i;
			}
			return fact;
				
		}
	}

	public static void myFun(int n) //n=145
	{
		int m=n, r=0, sum=0; //m=145
		
		while(m!=0) 
		{
			r = m%10; // r = 145%10 -> 5 // r = 14%10 ->4 // r = 1%10 -> 1
			sum = sum + Special.factorial(r); // sum = fact(5) -> sum = 0+120 -> sum = 120  // sum = 120+24 ->sum=144 // sum = 144+1 -> sum=145
			m = m/10; // m = 14 // m = 14/10 ->1 // m=1/10 -> 0.1 // here m become less than 1. so, it will come out of the while loop
		}

		if(n == sum)
		{
			System.out.println(n+" is a special number");
		}
		else
		{
			System.out.println(n+" is not a special number");
		}
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int r = s.nextInt();
		Special.myFun(r);	
		s.close();
	}
}