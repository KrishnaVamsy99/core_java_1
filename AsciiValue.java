/* Printing ASCII Value of java */
/* a=97, b=98 */

//import java.lang.*;
//import java.util.Scanner;

class AsciiValue
{
	public static void main(String []args) throws Exception
	{
		System.out.print("Enter a character: ");
		int r = System.in.read();
		System.out.print("The ASCII value of "+(char)r+" is "+r);
		
	}
}