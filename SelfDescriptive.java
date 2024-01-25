import java.util.Scanner;

class SelfDescriptive 
{
    public static boolean myFun(int n)
    {
        int m=n, r=0;
        //String s = Integer.toString(m);
        int len = Integer.toString(m).length();
        int i = len-1;

        char []ch = new char[len];
        int count[] = new int[len];

        while(m>0)
        {
            r = m%10;
            ch[i] = (char)(r+'0');
            m = m/10;
            i--;
        }

       for(int j=0;j<len;j++)
       {
            for(int k=0;k<len;k++)
            {
                if(j==(int)(ch[k]-'0'))
                {
                    count[j]++;
                }
            }
            if(count[j]!=(int)(ch[j]-'0'))
            {
                return false;
            }
       }

       return true;

    }
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        //SelfDescriptive.myFun(n);
        if(SelfDescriptive.myFun(n))
        {
            System.out.println(n+" is SelfDescriptive Number.");
        }
        else{
            System.out.println(n+" is not SelfDescriptive Number.");
        }
        
    }
    
}
