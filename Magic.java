/* Magic Number */
/* 325 -> 3+2+5=10 -> 1+0=1. it is magic number */

import java.lang.*;
import java.util.*;

class Magic
{
	public static void myFun(int n)
	{
		int m=n, r=0, sum1=0;
		while(m>9)
		{
			while(m>0)
			{
				r = m%10;
				sum1 = sum1+r;
				m = m/10;
			}
			m = sum1;
			sum1 = 0;
		}
		if(m == 1)
		{
			System.out.println(n+" is a magic number");
		}
		else
		{
			System.out.println(n+" is not a magic number");
		}
			
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);	
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		Magic.myFun(n);
	}
}