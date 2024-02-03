import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Symmetric
{
    static Scanner scan = new Scanner(System.in);

    public static boolean checkTranspose(int [][]arr, int m, int n)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]!=arr[j][i])
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkSquareMatrix(int m, int n)
    {
        if(m==n)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args)
    {
        try{
        
            //aij==aji is symmetric matrix.
            System.out.println("Enter how many rows you want: ");
            int m = scan.nextInt();
            System.out.println("Enter how many columns you want: ");
            int n = scan.nextInt();
            if(checkSquareMatrix(m, n))
            {
            
                int [][]arr = new int[m][n]; // 3x3 matrix. I am taking for an example
            
                System.out.println("Enter the numbers in the matrix...");
                //I am reading integers from keyboard.

                for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        System.out.print("Enter the number at a["+i+"]["+j+"]: ");
                        arr[i][j]=scan.nextInt();
                    }
                }
                System.out.println("..........................");
                // printing the matrix for practice purpose
                System.out.println("Just I am seeing the matrix for practice purpose");
                for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                }


                System.out.println("..................");

                System.out.println("Checking transpose of the matrix");

                System.out.println("....................");

                if(checkTranspose(arr,m,n))
                {
                    System.out.println("The given matrix is symmetric matrix");
                }
                else{
                    System.out.println("The given matrix is not symmetric matrix");
                }
            }
            else{
                System.out.println("ooreey mundhu square matrix enter cheyi raa saami.");
            }
        }catch(InputMismatchException e)
        {
            System.out.println("Input sarige evara saami");
        }catch(NoSuchElementException e)
        {
            System.out.println("alanti element aa ledhu ra babbu");
        }catch(Exception e)
        {
            System.out.println("Other exceptions vachayi chudu ra mundhu. mayidhari sachinoda");
        }

    }
    
}
