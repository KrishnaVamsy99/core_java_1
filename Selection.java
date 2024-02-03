class Selection 
{
    public static void main(String[] args) 
    {
        int arr[] = {5,1,4,3,2};
        int mini, temp;
        for(int i=0;i<arr.length;i++)
        {
            mini = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[mini])
                {
                    mini = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;

        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }
        
    }
    
}
