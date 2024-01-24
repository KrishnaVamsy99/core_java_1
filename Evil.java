/* Evil Number */
/* First number should be converted into binary form and now check the number of one's in the binary form. if the count of one's are even then it is evil number */

import java.lang.*;
import java.util.*;

class Evil
{
	public static int conToBin(int n) //15
	{
		char ch[] = new char[15];
		int m=n, r=0, i=0, count=0;
		while(m!=1)
		{
			r = m % 2;
			if(r==1)
			{
				ch[i] = (char)(r+'0'); // ch[i] = Character.forDigit(r, 2);
				i++;
				count++;
			}
			
			m = m/2;
		}
		
		return count+1;
		
	}

	public static void myFun(int n) //15
	{
		int count = conToBin(n); //15
		if(count%2==0)
		{
			System.out.println(n+" is a evil number");
		}
		else
		{
			System.out.println(n+" is odius number");
		}
		
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt(); //15
		Evil.myFun(n);
	}
}