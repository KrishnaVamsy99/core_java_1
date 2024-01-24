/* Unique Number */
/* 123 -> There are no repeated digits in this number */
/* 2523 -> 2 is repeated twice. So, it is not unique number */

import java.lang.*;
import java.util.*;

class Unique
{
	public static boolean myFun(int n)
	{
		int l = Integer.toString(n).length();
		char ch[] = new char[l];
		String s = Integer.toString(n);
		for(int i=0;i<l;i++)
		{
			ch[i] = s.charAt(i);
			//System.out.println(ch[i]);
		}
		
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if((int)ch[i]==(int)ch[j])
				{
					return false;
				}
			}
		}
		return true;
		
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		if(Unique.myFun(n))
		{
			System.out.println(n+" is Unique number");
		}
		else
		{
			System.out.println(n+" is not Unique number");
		}
	}
}