import java.util.Scanner;

class Strong 
{
    public static int fact(int n)
    {
        if(n<0)
        {
            return 0;
        }
        if(n==0 || n==1)
        {
            return 1;
        }
        else{
            int fact=1;
            for(int i=1;i<=n;i++)
            {
                fact = fact*i;
            }
            return fact;
        }
    }
    public static boolean checkStrong(int n)
    {
        int m=n, r=0, sum1=0;
        while(m>0)
        {
            r = m%10;
            sum1 = sum1 + fact(r);
            m = m/10;
        }
        if(sum1==n)
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
        if(checkStrong(n))
        {
            System.out.println(n+" is strong number");
        }
        else{
            System.out.println(n+" is not strong number;");
        }
        s.close();
    }
    
}
