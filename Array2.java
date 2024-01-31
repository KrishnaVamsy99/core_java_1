import java.util.Scanner;

class Array2 
{
    public static int findOut(int[] arr1, int key)
    {
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==key)
            {
                return i;
            }
        }
        return -1;
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

        System.out.println("Enter a number that you want to find out");
        int n = s.nextInt();

        int n1 = findOut(arr,n);
        if(n1==-1)
        {
            System.out.println(n+ " is not found");
        }
        else{
            System.out.println(n+" is found at "+n1);
        }

        s.close();
        
    }
    
}
