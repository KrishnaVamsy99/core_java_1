import java.util.Scanner;

class Cullen 
{
    public static double myFun(int n)
    {
        double m = (Math.pow(2, n) * n) + 1;
        return m;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        double d = myFun(n);
        System.out.println("Cullen Number for "+n +" is "+d);
        s.close();
    }
    
}
