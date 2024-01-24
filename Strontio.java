/* Strontio Number */
/* 1221 * 2 = 2442 -> hundreds and tens place are same then it is Strontio Number */

import java.lang.*;
import java.util.*;

class Strontio
{
	public static void myFun(int n)
	{	
		if(String.valueOf(n).length()!=4)
		{
			System.out.println("please enter 4 digit number");
		}
		else
		{
			int m=n,j=1,r=0,i=0;
			char ch[] = new char[4];
			m = m*2;
			while(m>0)
			{
				r = m%10;
				ch[i] = (char)(r+'0');
				m = m/10;
				i++;
			}
			if(ch[j] == ch[j+1])
			{
				System.out.println(n+" is a Strontio Number");
			}
			else
			{
				System.out.println(n+" is not Strontio Number");
			}
			
		}
		
	}
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 4 digit number: ");
		int n = s.nextInt();
		Strontio.myFun(n);
	}
}