/* Sum of Natural Numbers */

//import java.lang.*;
import java.util.*;

class SumOfNatural
{
	public static void myFun(int n)
	{
		int sum = 0;
		sum = n * (n+1)/2;
		System.out.println("Sum of Natural Numbers: "+sum);
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		SumOfNatural.myFun(n);
		s.close();
	}
}