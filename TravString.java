/* Traversing through String */

import java.lang.*;
import java.util.*;

class TravString
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s1 = s.nextLine();
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			System.out.println(ch);
		}
	}
}