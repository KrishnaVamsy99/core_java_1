import java.util.Scanner;

class Array1
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);   
        int[][] arr = new int[3][];
        arr[0] = new int[5];
        arr[1] = new int[4];
        arr[2] = new int[3];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("Enter a number in arr["+i+"]["+j+"]");
                arr[i][j] = s.nextInt();
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        s.close();
    }
    
}
