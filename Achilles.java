import java.util.Scanner;

class Achilles
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
    public static boolean myFun(int n)
    {
        int m=n,j=0;
        int []prime = new int[10];
        for(int i=1;i<=m;i++)
        {
            if(m%i==0)
            {
                if(Achilles.isPrime(i))
                {
                    prime[j] = i;
                    j++;
                }
            }
        }

        for(int l=0;l<prime.length;l++)
        {
            int k=prime[l]*prime[l];
            if(k!=0 && m%k!=0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();
        if(Achilles.myFun(n))
        {
            System.out.println(n+" is Achilles Number");
        }
        else{
            System.out.println(n+" is not Achilles Number");
        }
        s.close();
    }
}