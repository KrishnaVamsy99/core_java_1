/* Automorphic Number */
/* A number is called an automorphic number if and only if the square of the given number ends with the same number itself.
For example, 25, 76 are automorphic numbers because their square is 625 and 5776, respectively and the last two digits of the square represent the number itself */

import java.lang.*;
import java.util.*;

class Automorphic
{
	public static boolean myFun(int n)
	{
		int m=n,sq;
		sq = m*m;
		//int length = String.valueOf(n).length();
		while(m>0)
		{
			if(m%10!=sq%10)
			{
				return false;
			}
			m = m/10;
			sq = sq/10;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);	
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		if(Automorphic.myFun(n))
		{
			System.out.println(n+" is a Automorphic number");
		}
		else
		{
			System.out.println(n+" is not Automorphic number");
		}
	}
}