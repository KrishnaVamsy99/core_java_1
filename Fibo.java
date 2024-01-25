/* Fibonacci Series */
/* 0 1 1 2 3 5 8 13 21... */

//import java.lang.*;

class Fibo
{
	
	public static void display(int n)
	{
		int f=0, s=1, r=0;
		for(int i=0;i<n;i++)
		{
			r = f+s;
			System.out.print(f+" ");
			f = s;
			s = r;
			
		}
	}
	public static void main(String[] args)
	{
		Fibo.display(5);
	}
}