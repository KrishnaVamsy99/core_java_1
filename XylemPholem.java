/* Xylem Phloem number */
/* 34326 -? firstdigit+lastdigit -> 3+6=9 */
/* sum of digits excludes first and last digit -> 4+3+2 ->9 */
/* 9==9. So,it is a Xylem Number else it is a Pholem Number */

//import java.lang.*;
import java.util.*;

class XylemPholem
{
	public static void myFun(int n)
	{
		int m=n, r=0, i=0, sum1=0, sum2=0;
	
		int length = String.valueOf(n).length();

		char ch[] = new char[length];

		while(m>0)
		{
			r = m%10;
			ch[i] = (char) (r+'0');
			i++;
			m = m/10;
		}
	
		for(int j=0;j<length;j++)
		{
			if(j==0 || j==length-1)
			{
				sum1 = sum1 + (int)(ch[j] - '0');
				
			}
			else
			{
				sum2 = sum2 + (int)(ch[j] - '0');
				
			}
		}

		if(sum1 == sum2)
		{
			System.out.println(n+" is a Xylem number");
		}
		else
		{
			System.out.println(n+" is a Phloem number");
		}
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		XylemPholem.myFun(n);
		s.close();
	}
}