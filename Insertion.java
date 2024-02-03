class Insertion
{
    public static void main(String[] args) 
    {
        int arr[] = {5,2,1,4,3};
        int j,key;

        for(int i=1;i<arr.length;i++)
        {
            key = arr[i];
            j = i-1;

            while(j>=0 && arr[j]>key) 
            {
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = key;

        }

        for(int k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }
    }
    
}
