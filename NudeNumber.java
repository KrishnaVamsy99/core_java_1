import java.util.Scanner;

class NudeNumber 
{
    public static boolean myFun(int n) // 672
    {
        int m=n,r=0;
        while (m>0) 
        {
            r = m%10;
            try{
                if(n%r!=0)
                {
                    return false;
                }
            }catch(Exception e)
            {
                System.out.println("There is an Exception occured in your code");
                e.printStackTrace();
            }
            m = m/10;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        if(NudeNumber.myFun(n))
        {
            System.out.println(n+" is Nude Number");
        }
        else{
            System.out.println(n+" is not a Nude Number");
        }
        s.close();
    }
    
}
