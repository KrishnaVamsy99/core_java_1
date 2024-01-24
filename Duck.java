/* Duck Number */
/* If a number contains zero in it but zero should not be at the beginning */

import java.lang.*;
import java.util.*;

class Duck
{
	public static boolean myFun(int n)
	{
		int m=n,r=0;
		while(m!=0)
		{
			r = m%10;
			if(r==0)
			{
				return true;
			}
			m = m/10;
		}
		return false;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);	
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		if(Duck.myFun(n))
		{
			System.out.println(n+" is a duck number");
		}
		else
		{
			System.out.println(n+" is not duck number");
		}
	}
}