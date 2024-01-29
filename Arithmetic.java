import java.util.Scanner;

class Arithmetic
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter  number1: ");
        int m = s.nextInt();
        System.out.println("Enter number2: ");
        int n = s.nextInt();
        System.out.println("Enter a arithmetic symbol: ");
        String s1 = s.next();
        char ch = s1.charAt(0);
        int c;
        switch (ch) {
            case '+':
                c = m+n;
                System.out.println(c);
                break;
            case '-':
                c = m-n;
                System.out.println(c);  
                break; 
            case '*':
                c = m*n;
                System.out.println(c); 
                break;   
            case '/':
                c = m/n;
                System.out.println(c); 
                break;  
            case '%':
                c = m%n;
                System.out.println(c); 
                break;
            default:
                System.out.println("Please enter valid symbol.");
        }
        s.close();
        
    }
    
}
