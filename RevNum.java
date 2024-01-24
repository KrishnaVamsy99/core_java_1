/* Reversing Number */
/* 456 -> 654 */

import java.lang.*;
import java.util.Scanner;

class RevNum
{
	public static void myFun(int n)
	{
		int m=n, rev=0, r=0;
		while(m!=0)
		{
			r = m%10;
			rev = rev * 10 + r;
			m = m/10;
		}
		System.out.println("Reverse Number of "+n+" is "+rev);
	}

	public static void main(String a[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int r = s.nextInt();
		RevNum.myFun(r);
	}
}