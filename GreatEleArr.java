import java.util.Scanner;

class GreatEleArr 
{
    public static int max(int[] arr)
    {
        int m = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>m)
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

        
        int maxi = max(arr);
        System.out.println("Minimum element is: "+maxi);


        s.close();
    }
    
}
