/* Spy Number */
/* 132 = 1+3+2 = 6 */
/* 132 = 1*3*2 = 6 */

import java.lang.*;
import java.util.*;

class Spy
{
	public static void myFun(int n)
	{
		int m=n, sum=0, prod=1, r=0;
		while(m!=0)
		{
			r = m%10;
			sum = sum+r;
			prod = prod * r;
			m = m/10;
		}
		if(sum == prod)
		{
			System.out.println(n+" is a spy number");
		}
		else
		{
			System.out.println(n+" is not a spy number");
		}
			
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		Spy.myFun(n);
	}
}