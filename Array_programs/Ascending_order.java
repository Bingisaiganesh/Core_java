import java.util.Scanner;
class Ascending_order
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter array size");
        int size=s.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println("enter element at position:"+i);
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}