import java.util.InputMismatchException;
import java.util.Scanner;

class RotateArray
{
    static Scanner scan = new Scanner(System.in);
    
    // please comment the one of  rotateLeft and rotateRight methods before running. Make sure you run only one method 
    // or else you will be confused. If you run rotateRight method, please comment  rotateLeft and viceversa.

    public static int[] rotateLeft(int []arr, int count)
    {
        if(arr.length==0)
        {
            return null;
        }
        try{
            for(int i=0;i<count;i++)
            {
                int temp = arr[0];
                int j;
                for(j=0;j<arr.length-1;j++)
                {
                    arr[j] = arr[j+1];
                }
                arr[j] = temp;
            }
        }catch(IndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        return arr;
    }

    public static int[] rotateRight(int []arr, int count)
    {
        if(arr.length==0)
        {
            return null;
        }
        try{
            for(int i=0;i<count;i++)
            {
                int temp = arr[arr.length-1];
                int j;
                for(j=arr.length-1;j>0;j--)
                {
                    arr[j] = arr[j-1];
                }

                arr[0] = temp;
            }
        }catch(IndexOutOfBoundsException e)
        {
            e.printStackTrace();
            System.out.println("arreee dhikumanaloada index out of bounds sariga chusi type cheyara");
        }
        return arr;
    }

    public static void printArray(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static int[] readArray(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the element in the index: "+i);
            arr[i] = scan.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) 
    {
        try{

            System.out.println("Enter how many elements that you want to store in the array: ");
            int n = scan.nextInt();

            //storing an array in the arr variable.
            int []arr = new int[n]; // {0,0,0,0,0};
            System.out.println("Now enter the elements in the array.");

            //calling readArray method to read array values from the user(keyboard)
            arr = readArray(arr);

            System.out.println(".............................................");

            //printing array elements
            printArray(arr);

            System.out.println(".............................................");

            // Now asking user to give an input from keyboeard, so that that many times array will be rotated.
            System.out.println("Enter a number to rotate that many times.");
            int ask = scan.nextInt();

            System.out.println("..............................................");

            // calling rotateRight method so that it will rotate right with given number.
            //arr = rotateRight(arr,ask); 
        
            if(arr==null)
            {
                System.out.println("Hey Man. Please enter elements in the array first. Then you can rotate");
            }
            else{
                System.out.println("rotating right...");
                printArray(arr);
            }
            System.out.println("..............................................");

            arr = rotateLeft(arr,ask);

            if(arr == null)
            {
                System.out.println("Hey Man. Please enter elements in the array first. Then you can rotate");
            }
            else{
                System.out.println("Rotating left....");
                printArray(arr);
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println("Index out of bounds vachindi ra verri sachinoda");
        }catch(InputMismatchException e){
            System.out.println("Arree input sariga evara sachinoda ");
        }


        scan.close();
        
    }
    
}
