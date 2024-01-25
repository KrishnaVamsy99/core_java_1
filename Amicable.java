import java.util.Scanner;

class Amicable 
{
    public static void myFun(int m, int n)
    {
        int sum1=0, sum2=0;
        for(int i=1;i<m;i++)
        {
            if(m%i==0)
            {
                sum1 = sum1 + i;
            }
        }

        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum2 = sum2 + i;
            }
        }

        if(sum1 == n && sum2 == m)
        {
            System.out.println(m+" "+n+" are Amicable Numbers");
        }
        else{
            System.out.println(m+" "+n+" are not Amicable Numbers");
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int m = s.nextInt();
        int n = s.nextInt();
        Amicable.myFun(m,n);
        s.close();
    }
    
}
