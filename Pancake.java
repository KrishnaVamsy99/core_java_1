import java.util.Scanner;

class Pancake 
{
    public static int myFun(int n)
    {
        return ((n*n)+n+2)/2;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = s.nextInt();
        int m = myFun(n);
        System.out.println(m);
        s.close();
    }
    
}
