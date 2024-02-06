import java.text.DecimalFormat;
import java.util.Random;

class OTPGenerator 
{
    public static String generateOtp(int len)
    {
        String numbers = "0123456789";
        Random r = new Random();
        char []otp = new char[len];
        for(int i=0;i<len;i++)
        {
            otp[i] = numbers.charAt(r.nextInt(numbers.length()));
        }
        return new String(otp);
    }
    public static void main(String[] args) 
    {
        int length = 6;
        String otp = generateOtp(length);
        System.out.println("your otop is: "+otp);

        String otp1= new DecimalFormat("000000").format(new Random().nextInt(999999));
        System.out.println(otp1);
    }
    
}
