import java.util.Scanner;

class Tetranacci
{
    public static int myFun(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 1;
        }
        if(n==3)
        {
            return 2;
        }
        return myFun(n-1)+myFun(n-2)+myFun(n-3)+myFun(n-4);

    }
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        int m = myFun(n);
        System.out.println(m);
        s.close();
    }
    
}
