/* Palindrome */
/* 343, 545, 1001 etc */

/*
	1. get the remainder(modulus 10) from the given number
	2. add the remainder to the reverse variable
	3. divide the given number with 10
*/

import java.lang.*;
import java.util.Scanner;

class Palin
{
	public static void myFun(int n)
	{
		int m=n, rev = 0, r=0;
		while(m!=0)
		{
			r = m%10;
			rev =rev * 10 + r;
			m =m/10;		
		}
		if(rev==n)
		{
			System.out.println("The given number "+n+" is palindrome");
		}
		else
		{
			System.out.println("The given number "+n+" is not palindrome");
		}
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=s.nextInt();
		Palin.myFun(n);
	}
}