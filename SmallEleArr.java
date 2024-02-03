import java.util.Scanner;

class SmallEleArr
{
    public static int min(int[] arr)
    {
        int m = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<m)
            {
                m = arr[i];
            }
        }
        return m;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter numbers in array");

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter number at indext "+i);
            arr[i] = s.nextInt();
        }

        
        int mini = min(arr);
        System.out.println("Minimum element is: "+mini);


        s.close();
    }
    
}
