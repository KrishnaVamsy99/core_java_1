/* Tech Number */
/* 2025 -> 20 | 25 -> 20+25=45 -> 45 *45 -> 2025*/
/* given number 2025 == result 2025 */

import java.lang.*;
import java.util.*;

class Tech
{
	public static boolean myFun(int n)
	{
		int m=n, count=0, i=0,r=0,num=0,sum=0,sq=0,l=0;
		String s="";
		char ch[] = new char[10];
		l = String.valueOf(n).length();
		if(l%2!=0)
		{
			return false;
		}
		while(m>0)
		{
			r = m%10;
			ch[i] = (char)(r+'0');
			m = m/10;
			i++;
			count++;
		}
		count = count/2;
		for(int j=l-1;j>=0;j--)
		{
			if(j%2==0)
			{
				s = Integer.toString(ch[j+1]-'0') + Integer.toString(ch[j]-'0') ;
				num = Integer.parseInt(s);
				sum = sum + num;
				
			}
		}
		sq = sum * sum;
		if(sq==n)
		{
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		if(Tech.myFun(n))
		{	
			System.out.println(n+" is a Tech number");
		}
		else
		{
			System.out.println(n+" is not a Tech number");
		}
	}
}