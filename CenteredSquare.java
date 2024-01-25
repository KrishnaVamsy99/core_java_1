import java.util.Scanner;

class CenteredSquare
{
    public static int myFun(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return myFun(n-1) + 4 *(n-1);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        int m = CenteredSquare.myFun(n);
        System.out.println(m);
        s.close();
    }
    
}
