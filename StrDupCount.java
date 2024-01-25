/* Counting duplicates in string */
/* India is my country */
/* i - 3, n - 2, y - 2 */

//import java.lang.*;
import java.util.Scanner;

class StrDupCount
{
	public static void myFun(String str)
	{
		
		int countchar[] = new int[128];

		str = str.toLowerCase();

		for(int i=0;i<str.length();i++)
		{
			char currentchar = str.charAt(i);

			if(Character.isLetter(currentchar))
			{
				countchar[currentchar]++;
			}
		}

		System.out.println("Duplicates values repeated are: ");
		for(int i=0;i<countchar.length;i++)
		{
			if(countchar[i] >1)
			{
				System.out.println((char)i+" repeated "+countchar[i]+" times");
			}
		}
		
		
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s1 = s.nextLine();
		StrDupCount.myFun(s1);	//"hello world"
		s.close();
	}
}