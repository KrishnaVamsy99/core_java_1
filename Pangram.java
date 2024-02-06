import java.util.HashMap;
import java.util.HashSet;

class Pangram
{
    public static boolean isPan(String str)
    {
        HashSet<Character> ch = new HashSet<>();

        for(char c: str.toLowerCase().toCharArray())
        {
            if(Character.isAlphabetic(c))
            {
                ch.add(c);
            }
        }
        return ch.size()==26;
        
    }
    public static void main(String[] args)
    {
        String s = "Pack my box with five dozen liquor jugs"; // it contains all letters in the alphabets
        if(isPan(s))
        {
            System.out.printf("%s is pangram\n\n",s);
        }
        else{
            System.out.printf("%s is not pangram\n",s);
        }
    }
    
}
