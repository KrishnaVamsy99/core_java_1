import java.util.Scanner;

class Sphenic
{
    public static boolean checkPrime(int n)
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
        //int m=n;
        int a[] = new int[3];
        int prod = 1, j=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                if(Sphenic.checkPrime(i))
                {
                    a[j] = i;
                    j++;
                }
            }
        }
        for(int k=0;k<3;k++)
        {
            prod = prod * a[k];
        }

        if(prod!= n)
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
        if(Sphenic.myFun(n))
        {
            System.out.println(n+" is Sphenic Number");
        }
        else{
            System.out.println(n+" is not Sphenic Number");
        }
        s.close();
    }
}