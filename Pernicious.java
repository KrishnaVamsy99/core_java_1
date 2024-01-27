import java.util.Scanner;

class Pernicious
{
    public static boolean isPrime(int n)
    {
        int count = 0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count = count+1;
            }
        }
        if(count==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean myFun(int n)
    {
        int m=n, count=0, r=0;
        if(n<=0)
        {
            return false;
        }
        while(m>1)
        {
            r = m%2;
            if(r==1)
            {
                count = count+1;
            }
            m = m/2;
        }
        count=count+1;
        if(!(isPrime(count)))
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
        if(myFun(n))
        {
            System.out.println(n+" is pernicious number");
        }
        else{
            System.out.println(n+" is not pernicious number");
        }
        s.close();
        
    }
}
