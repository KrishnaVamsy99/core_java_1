/* Reversing a String */
/* vamsy -> ysmav */

import java.lang.*;
import java.util.Scanner;

class RevStr
{
	public static void myFun(String str)
	{
		String rev ="";
		int len = str.length();
		char []ch = str.toCharArray();
		for(int i=len-1; i>=0;i--)
		{
			//rev = rev + str.charAt(i);
			rev = rev + ch[i];
			
			
		}
		System.out.println("The reversed String is: "+rev);
		
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s1 = s.nextLine();
		RevStr.myFun(s1);
	}
}