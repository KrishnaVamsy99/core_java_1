/* Perfect Square */

//import java.lang.*;
import java.util.*;

class PerfectSq
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		double sqrt = Math.sqrt(n);
		if((sqrt - Math.floor(sqrt))==0.0)
		{
			System.out.println("It is a perfect square");
		}
		else
		{
			System.out.println("It is not perfect square");
		}
		s.close();
	
	}
}