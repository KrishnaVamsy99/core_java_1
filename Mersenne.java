import java.util.Scanner;

class Mersenne
{
    public static boolean isPrime(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count=count+1;
            }
        }
        if(count!=2)
        {
            return false;
        }
        return true;
    }
    public static void myFun(int n)
    {
        int m;
        
        for(int i=1;i<n;i++)
        {
            if(isPrime(i))
            {
                m = (int)Math.pow(2, i);
                m = m-1;
                System.out.println(i+"......"+m);
                
            }

        }
       


    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();
        myFun(n);
        s.close();
    }
    
}
