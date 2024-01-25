/* Lead Number */
/* 6732 - 6 + 2 = 8, 3+7 = 10 -> not lead */
/* 6369 - 6+6 = 12, 3+9=12 */

//import java.lang.*;
import java.util.*;

class Lead
{
	public static void myFun(int n)
	{
		int m=n, r=0, sumeven = 0, sumodd = 0;
		while(m>0)
		{
			r = m%10;
			if(r%2==0)
			{
				sumeven = sumeven + r;
			}
			else
			{
				sumodd = sumodd + r;
			}
			m = m/10;
		}
		if(sumeven == sumodd)
		{
			System.out.println(n+" is a lead number");
		}
		else
		{
			System.out.println(n+ " is not a lead number");
		}
		
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		Lead.myFun(n);
		s.close();
	}
}