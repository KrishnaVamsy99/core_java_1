import java.lang.*;
import java.util.*;

class Otp
{
	public static String generateOtp(int len)
	{
		String nums = "0123456789";
		Random r = new Random();
		char []otp = new char[len];
		for(int i=0;i<len;i++)
		{
			otp[i] = nums.charAt(r.nextInt(nums.length()));
		}
		return new String(otp);
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many number otp you want: ");
		int l = s.nextInt();
		String otp = generateOtp(l);
		System.out.println(otp);

	}
}