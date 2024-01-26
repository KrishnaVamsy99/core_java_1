import java.util.Scanner;

class Moran 
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
    public static int digitSum(int n) //22
    {
        int sum1=0, r=0, m=n;
        while(m>0)
        {
            r = m%10; //22
            sum1 = sum1 + r;//0+2=2,2+2=4
            m = m/10; //2//
        }
        return sum1;
    }
    public static boolean myFun(int n) // 22
    {
        int sum1 = digitSum(n); // 4

        if(n%sum1==0 && isPrime(n/sum1)) // 22/4
        {
            return true;
        }
        return false;
        
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        if(myFun(n))
        {
            System.out.println(n+" is Moran Number");
        }
        else
        {
            System.out.println(n+" is not Moran Number");
        }
        s.close();
    }
    
}
