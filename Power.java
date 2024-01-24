/* Power */
/* 2**3 = 8 */

import java.lang.*;
import java.util.*;

class Power
{
	public static void myFun(int m, int n) // m = 2, n=3
	{
		int pow = 0;
		for(int i=1;i<n;i++)
		{
			pow = pow+m*m; //2*2*2
		}
		System.out.println(pow);
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		try
		{
			int m = s.nextInt();
			int n = s.nextInt();
			Power.myFun(m,n);
		}
		catch(Exception e)
		{
			System.out.println("Please enter correct values");
			e.printStackTrace();
		}
	}
}