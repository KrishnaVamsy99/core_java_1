/* Factorial */
/* 5! = 5*4*3*2*1 = 120 */
import java.lang.*;
import java.util.Scanner;

class Fact
{
	public static void myFun(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact = fact * i;
		}
		System.out.println("For the given number "+n+" the factorial is "+fact);
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("please enter the number ");
		int n = s.nextInt();
		Fact.myFun(n);
		
	}
}