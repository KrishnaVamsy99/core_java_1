import java.util.Scanner;

class Naracissitic 
{
    public static void myFun(int n)
    {
        int m=n,count=0,l=0;

        double sum=0.0;
        while(m>0)
        {
            //r = m%10;
            count=count+1;
            m = m/10;
        }

        int k = n;

        while(k>0)
        {
            l = k%10;
            sum = sum + Math.pow(l ,count);
            k = k/10;
        }

        if(sum==n)
        {
            System.out.println(n+" is Narcissitic Number.");
        }
        else{
            System.out.println(n+" is not Narcissitic Number.");
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        myFun(n);
        s.close();  
    }
    
}
