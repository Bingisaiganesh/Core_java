 class Largest_number {
    public static void main(String[] args)
    {
        int element=1;
        int arr []={1,2,3,4};
        for(int i=0;i<=arr.length-1;i++)
        { 
            if(arr[i]>element)
            {
                element=arr[i];
            }   
        }
        System.out.println(element); 
    }
}
