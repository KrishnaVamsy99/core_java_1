/* Display odd numbers from 1 to 100 */

import java.lang.*;
import java.util.*;

class DispOdd
{

	public static void myFun()
	{
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i);
			}
		}
	}

	public static void main(String[] args)
	{
		DispOdd.myFun();
	}
}