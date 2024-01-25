/* Neon Number */
/* 9 -> 9 * 9 = 81 -> 8+1 = 9 */

//import java.lang.*;
import java.util.*;

class Neon
{
	public static void myFun(int n) //9
	{
		int m=n, sq=0, sum=0, r=0;
		sq = m * m; //81
		while(sq>0)
		{
			r = sq%10;
			sum = sum + r;
			sq = sq/10;	
		}
		if(sum==n)
		{
			System.out.println(n+" is a Neon Number");
		}
		else
		{
			System.out.println(n+" is not a Neon Number");
		}
		
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		Neon.myFun(n);
		s.close();
	}
}