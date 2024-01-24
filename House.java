/* House number */
/* Hs = (s+1) + Ek=1 to s k*k, where s>=0 */

import java.lang.*;
import java.util.*;

class House
{
	public static void myFun(int n)
	{
		int sum = (n+1) * (n+1) * (n+1);
		for(int k=1;k<=n;k++)
		{
			sum = sum + (k*k);
		}
		System.out.println("House number of "+n+" is "+sum);
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		House.myFun(n);
	}
}