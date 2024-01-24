/* Largest of three numbers */

import java.lang.*;
import java.util.*;

class LargestOfThree
{
	public static void myFun(int a, int b, int c)
	{

		if(a>b && a>c)
		{
			System.out.println(a+" is great");
		}
		else if(b>c)
		{
			System.out.println(b+" is great");
		}
		else
		{
			System.out.println(c+" is great");
		}	
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		LargestOfThree.myFun(a,b,c);
		
	}
}