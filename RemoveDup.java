import java.util.InputMismatchException;
import java.util.Scanner;

class RemoveDup
{
    static Scanner scan = new Scanner(System.in);

    public static void deleteDup(int []arr1, int length)
    {
        int []arr2 = new int[length];
        int temp;
        boolean flag;
        int k=0;

        try{
            for(int i=0;i<arr1.length;i++)
            {
                flag = true;
                temp = arr1[i];
                for(int j=i+1;j<arr1.length;j++)
                {
                    if(arr1[j]==temp)
                    {
                        flag = false;
                    }
                }
                if(flag)
                {
                    arr2[k] = temp;
                    k = k+1;
                }
            }
        }catch(IndexOutOfBoundsException e)
        {
            System.out.println("arreee malli index out of bounds exception ra. malli check cheyi");
        }
        catch(Exception e)
        {
            System.out.println("Other exception occured");
            e.printStackTrace();
        }
        System.out.println("printing elements in the deleteDup method iteself.");
        for(int l=0;l<k;l++)
        {
            System.out.println(arr2[l]);
        }
    }
    public static void main(String[] args) 
    {
        try{
            System.out.println("Enter how many elements that you want to store in the array: ");
            int n1 = scan.nextInt();

            int []arr = new int[n1];

            System.out.println("Now enter the elements in the array");

            arr = RotateArray.readArray(arr);

            System.out.println("......................................");

            System.out.println("Printing array for practice purpose");

            RotateArray.printArray(arr);

            System.out.println("........................................");

            System.out.println("Array after deleting duplicates");

            deleteDup(arr, arr.length);

           


        }catch(IndexOutOfBoundsException e)
        {
            System.out.println("arree babu index out of bounds anta adhi chudu mundu gadidha");
        }
        catch(InputMismatchException e)
        {
            System.out.println("arree dunapotha sariga input evaraaa. nee gimadiponu");
        }catch(Exception e)
        {
            System.out.println("other exception occured");
            e.printStackTrace();
        }
        scan.close();

        
    }
}
