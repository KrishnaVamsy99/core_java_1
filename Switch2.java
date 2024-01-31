enum Days{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FIRDAY, SATURDAY, SUNDAY;}

class Switch2
{
    public static void main(String[] args)
    {
        

        Days d1 = Days.FIRDAY;
        int count;
        count = switch(d1){
            case  SUNDAY, MONDAY, FIRDAY-> 6;
            case  TUESDAY, THURSDAY-> 7;
            case  WEDNESDAY, SATURDAY-> 8;
            default -> -1;
        };
        System.out.println(count);

        
    }
    
}
