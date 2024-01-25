/* ISBN Number */
/* The ISBN number is a legal number when 1*Digit1 + 2*Digit2 + 3*Digit3 + 4*Digit4 + 5*Digit5 + 6*Digit6 + 7*Digit7 + 8*Digit8 + 9*Digit9 + 10*Digit10 is divisible by 11 */
/*  	
8147852369 -> (1*9) + (2*6) + (3*3) + (4*2) + (5*5) + (6*8) + (7*7) + (8*4) + (9*1) + (10*8) 
    	
Sum = 9 + 12 + 9 + 8 + 25 + 48 + 49 + 32 + 9 + 80

Sum = 281

rem = 281 % 11 =0

*/

//import java.lang.*;
import java.util.*;

class Isbn
{

	public static void myFun(long number)
	{
	int sum = 0;
        int multiplier = 10;

        while (number > 0) {
            int digit = (int) (number % 10);
            sum += multiplier * digit;
            number /= 10;
            multiplier--;
        }
		if(sum%11==0)
		{
			System.out.println(number+" is ISBN number");
		}
		else
		{
			System.out.println(number+" is not ISBN number");
		}
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long n = s.nextLong();
		Isbn.myFun(n);
		s.close();
	}
}
