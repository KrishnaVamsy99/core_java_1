import java.util.Scanner;

class VowelDigitConsonant 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any Character: ");
        String s1 = s.next().toLowerCase();
        char ch = s1.charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println(ch+" is vowel");
        }
        else if(Character.isDigit(ch))
        {
            System.out.println(ch+" is digit");
        }
        else if(Character.isLetter(ch))
        {
            System.out.println(ch+" is consonent");
        }
        else{
            System.out.println(ch+" is a symbol.");
        }
        s.close();

        
    }
    
}
