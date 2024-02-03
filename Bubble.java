class Bubble
{
    public static void main(String[] args) 
    {
        int arr[] = {5,3,1,4,2};
        int temp;
        try{
            for(int i=0;i<arr.length-1;i++)
            {
                for(int j=0;j<arr.length-i-1;j++)
                {
                    if(arr[j]<arr[j+1])
                    {
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }

            for(int k=0;k<arr.length;k++)
            {
                System.out.println(arr[k]);
            }

        }catch(IndexOutOfBoundsException e)
        {
            System.out.println("Index out of bounds");
        }
        
    }
    
}
