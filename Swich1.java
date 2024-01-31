import java.util.Scanner;
class Swich1
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose option");
        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. multiplication");
        System.out.println("4. divison");
        System.out.println("enter option number: ");
        int opt = s.nextInt();
        System.out.println("Enter number 1: " );
        int a = s.nextInt();
        System.out.println("Enter number 2: ");
        int b = s.nextInt();
        int c;
        switch (opt) 
        {
            case 1 -> 
            {
                System.out.println("Doing addition");
                c = a+b;
            }
            case 2 -> 
            {
                System.out.println("Doing subtraction");
                c = a-b;
                System.out.println("sub "+c);
            }
            case 3 -> 
            {
                System.out.println("Doing multiplication");
                c = a*b;
                System.out.println("mul "+c);
            }
            case 4 -> 
            {
                System.out.println("Doing divison");
                c = a/b;
                System.out.println("div "+c);
            }
            default ->{System.out.println("Invalid option");}
        }


        s.close();

        
    }    
}
