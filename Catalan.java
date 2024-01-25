/* Catalan number */

//import java.lang.*;
import java.util.*;

class Catalan
{
	public static int fact(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		else
		{
			return n * fact(n-1);
		}
	}
	public static int myFun(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		else
		{
			n = (fact(2*n)/(fact(n)*fact(n)))/(n+1);
		}
		return n;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		int m = Catalan.myFun(n);
		System.out.println(m);
		s.close();
	}
}