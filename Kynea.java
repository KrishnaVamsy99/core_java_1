/* Kynea Number */
/* F(k) = 4 x F(k - 1) - 2 k + 1 + 3, where F(0) is equal to 2. */

//import java.lang.*;
import java.util.*;

class Kynea
{
	public static int myFun(double n)
	{
		if(n==0)
		{
			return 2;
		}
		else
		{
			return 4 * myFun(n-1) - ((int)Math.pow(2, n+1)) + 3;
		}
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		int num = Kynea.myFun(n);
		System.out.println("Kynea number is "+num);
		s.close();
	}
}