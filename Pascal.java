import java.util.Scanner;

class Pascal
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
        else
        {
            int fact = 1;
            for(int i=1;i<=n;i++)
            {
                
                fact = fact*i;
            }
            return fact;

        }
        
    }
    public static int comb(int n, int r)
    {
        if(n<0 || r<0)
        {
            return 0;
        }
        return (fact(n) /(fact(n-r) * fact(r)));
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to view that many lines of pascal's triangle.");
        int n = s.nextInt();

        System.out.println("............................");

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(comb(i,j)+" ");

            }
            System.out.println();
        }

        s.close();
    }
    
}
