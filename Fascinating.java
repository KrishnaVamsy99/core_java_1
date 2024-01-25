/* Fascinating Number */
/* 327 - 327 * 2 = 654, 327 * 3 = 981 */
/* "327" + "654" + "981" -> "327654981" */
/* Now check if it has all numbers from 1 to 9 */

//import java.lang.*;
import java.util.*;

class Fascinating
{
	public static boolean myFun(int n)
	{
		if(String.valueOf(n).length()!=3)
		{
			return false;
		}
		
		int m=n, mul1 = 1, mul2 = 1,count=0;
		String s="";
		mul1 = m * 2;
		mul2 = m * 3;
		
		s = String.valueOf(mul1) + String.valueOf(mul2);
		
		int ch[] = new int[9];

		for(int i=0;i<=s.length();i++)
		{
			ch[(int)s.charAt(i)] = ch[i]++;
		}
	
		for(int i=1;i<=s.length();i++)
		{
			if(ch[i]==1)
			{
				count++;
			}
		}
		if(count==9)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		boolean b = Fascinating.myFun(n);
		if(b){
			System.out.println(n+" is Fascinating number");
		}	
		else
		{
			System.out.println(n+" is not Fascinatig number");
		}
		s.close();
	}
}