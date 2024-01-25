/* Armstrong Number */
/* 153 = 1**3 + 5**3 + 3**3 -> 153 */

//import java.lang.*;
import java.util.*;

class Armstrong
{
	public static void myFun(int n)
	{
		int m=n, sum=0,r=0;
		while(m!=0)
		{
			r=m%10; // 153%10=3 //5 // 1
			sum = sum + r*r*r; // sum = 0+27=27 // sum=27+125=152 // sum=152+1=153
			m=m/10; //153/10=15 // 15/10=1 // 1/10
		}
		if(n==sum)
		{
			System.out.println(n+" is a armstrong number");
		}
		else
		{
			System.out.println(n+" is not a armstrong number");
		}
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		Armstrong.myFun(n);
		s.close();
	}
}