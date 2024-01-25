import java.util.Scanner;

class Happy
{
    public static boolean myFun(int n)
    {
        int m=n, r=0,sum=0;
        while(m>9)
        {
            while(m>0)
            {
                r = m%10;
                sum = sum + (r*r);
                m = m/10;
            }
            m = sum;
            sum = 0;
        }
        if(m!=1)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        if(Happy.myFun(n))
        {
            System.out.println(n+" is Happy Number");
        }
        else{
            System.out.println(n+" is not Happy Number");
        }
        s.close();
    }
}