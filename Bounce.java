/* Increasing Bounce Number */
/* 1234 -> from left to right the number are increasing */

import java.lang.*;
import java.util.*;

class Bounce
{
	

	public static boolean myFun(int n) // 1234
	{
		int m=n, r=0, i=0;
		String s = Integer.toString(n);
		int len = s.length();
		char ch[] = new char[len];
		boolean flag = true;
		while(m>0)
		{	
			r = m%10; //4
			ch[i] = (char)(r+'0');
			m = m/10;
			i++;
		}

		for(int j=0;j<len-1;j++)
		{
			if((int)ch[j]<(int)ch[j+1])
			{
				flag = false;
			}
		}
		return flag;
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		if(Bounce.myFun(n))
		{
			System.out.println(n+" is Increasing Bouncing Number");
		}
		else
		{
			System.out.println(n+" is not Increasing Bouncing Number");
		}
		
	}
}