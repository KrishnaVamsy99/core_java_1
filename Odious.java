/* Odious Number */
/* 1 - 0001 -> 1+0+0+0 = 1 -> 1 is an odd number. so, it is a odious number */
/* 2 - 0010 -> 0+1+0+0 = 1 -> 1 is an odd number. so, it is a odious number */
/* 3 - 0011 -> 1+1+0+0 = 2 -> 2 is an even number. so, it is not odious number */

//import java.lang.*;
import java.util.*;

class Odious
{
	public static void myFun(int n)
	{
		int m=n,r=0,sum=0;

		while(m!=1)
		{
			r = m%2;
			sum = sum + r;
			m = m/2;	
		}

		if(sum%2==0)
		{
			System.out.println(n+" is odious number");
		}
		else
		{
			System.out.println(n+" is not odious number");
		}
		
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Ente a number: ");
		int n=s.nextInt();
		Odious.myFun(n);
		s.close();
	}
}
