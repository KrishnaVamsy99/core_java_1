import java.util.Scanner;

class Buzz
{
    public static int lastDigit(int n)
    {
        int r=0;
        r = n%10;
        return r;
    }
    public static boolean myFun(int n) //42 //107 //134
    {
        int m=n;
        if(m%7==0 || lastDigit(m)==7)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        if(myFun(n))
        {
            System.out.println(n+" is Buzz Number");
        }
        else{
            System.out.println(n+" is not Buzz Number");
        }
        s.close();
    }
}