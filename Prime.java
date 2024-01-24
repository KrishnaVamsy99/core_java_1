/* Prime Number */
/* A number is divisible by itself and 1. it is called as a prime number */
/* 2,3,5,7,11,13...*/

import java.lang.*;
import java.util.*;

class Prime
{
	//Checking whether a number is prime or not
	public static void myFun(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}	
		}
		if(count == 2)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is a composite number");
		}
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		Prime.myFun(n);
	}
}