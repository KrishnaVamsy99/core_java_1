import java.util.Scanner;

class Ramanjuan
{
    public static boolean myFun(int n)
    {
        int m=n, r=0, sum=0, rev=0,k=0;
        
        while(m>0)
        {
            r = m%10;
            sum = sum + r;
            m = m/10;
        }
        int sum1 = sum;
        while(sum1>0)
        {
            k = sum1%10;
            rev = rev * 10 + k;
            sum1 = sum1/10;
        }

        return n==(rev*sum);

    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        //myFun(n);
        if(myFun(n))
        {
            System.out.println(n+" is Ramanjuan Number");
        }
        else{
            System.out.println(n+" is not Ramanjuan Number");
        }
        s.close();
    }
    
}
