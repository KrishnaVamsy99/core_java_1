/* Printing prime numbers from 1 to n */

//import java.lang.*;
import java.util.*;

class Prime1
{
	public static void myFun(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i+" is a prime number");
			}
			else
			{
				System.out.println(i+" is a composite number");
			}	
		}

	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		Prime1.myFun(n);
		s.close();
	}
}