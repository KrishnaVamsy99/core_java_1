import java.util.Scanner;

class Smith
{
    public static boolean isPrime(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static int digitSum(int n)
    {
        int m=n, sum1 = 0, r=0;
        while(m>0)
        {
            r = m%10;
            sum1 = sum1 + r;
            m = m/10;
        }
        return sum1;
    }
    public static boolean myFun(int n)
    {
        int sum1 = 0;
        sum1 = digitSum(n);
        int sum2 = 0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                if(isPrime(i))
                {
                    sum2 = sum2 + digitSum(i);
                }
            }
        }

        if(sum1==sum2)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        if(myFun(n))
        {
            System.out.println(n+" is Smith Number");
        }
        else{
            System.out.println(n+" is not Smith Number");
        }
        s.close();
    }
    
}
