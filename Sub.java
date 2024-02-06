import java.util.HashMap;

class Sub 
{
    public static void main(String[] args) 
    {
        String str = "Pack my box with five dozen liquor jugs";
        HashMap<Character, Integer> hm = new HashMap<>();
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            hm.put(str.charAt(i), 1);
        }
        String alphabets = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(hm.get('a'));
        
    }
    
}
