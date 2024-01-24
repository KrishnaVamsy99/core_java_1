/* Sunny Number */
/* 80 -> 80 + 1 =81. 81 is perfect square. so, 80 is a perfect square. */

import java.lang.*;
import java.util.*;

class Sunny
{
	public static void myFun(int n)
	{
		int m=n;
		double sq=0;
		m = m+1;
		sq = Math.sqrt(m);
		if(sq - Math.floor(sq) == 0)
		{
			System.out.println(n+" is a sunny number");
		}
		else
		{
			System.out.println(n+" is not a sunny number");
		}
		
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		Sunny.myFun(n);
	}
}