import java.util.InputMismatchException;
import java.util.Scanner;

class Transpose 
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        try{

            System.out.println("Enter number of rows: ");
            int m = scan.nextInt();
            System.out.println("Enter number of columns: ");
            int n = scan.nextInt();
            int [][]arr = new int[m][n];
            int [][]temp = new int[n][m];

            System.out.println("Enter numbers in the matrix from the keyboard");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print("Enter the number at a["+i+"]["+j+"]: ");
                    arr[i][j]=scan.nextInt();
                }
            }

            System.out.println("printing matrix for practice purpose...");

            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }

            // transposing matrix
            System.out.println("....................");
            System.out.println("Tansposing matrix\n");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    temp[j][i]=arr[i][j];
                }
            }

            System.out.println("...................");
            System.out.println("Transposed matrix: ");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(temp[i][j]+" ");
                }
                System.out.println();
            }
        


        }catch(InputMismatchException e)
        {
            System.out.println("Input sariga evura saami...");
        }catch(IndexOutOfBoundsException e)
        {
            System.out.println("Index out of bounds exception vachayi...");
        }
    }
    
}
