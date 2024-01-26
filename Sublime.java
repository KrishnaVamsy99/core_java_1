import java.util.Scanner;

class Sublime
{
    public static boolean myFun(int n)
    {
        int count = 0;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum = sum + i;
                count++;
            }  
        }
        if(Perfect.myFun(count) && Perfect.myFun(sum))
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
        if(myFun(n))
        {
            System.out.println(n+ " is Sublime Number");
        }
        else{
            System.out.println(n+ " is not Sublime Number");
        }
        s.close();
    }
    
}
