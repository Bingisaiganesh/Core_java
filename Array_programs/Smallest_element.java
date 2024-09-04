public class Smallest_element {
    public static void main(String[] args)
    {
        int element=9;
        int arr[]={8,7,5,3};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<element)
            {
                element=arr[i];
            }
        }
        System.out.println(element);
    }
}
