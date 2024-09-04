import java.util.Scanner;
public class Second_largest_num 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);

            int arr[]={5,2,3,9};
            for(int i=0;i<arr.length;i++)
            {
                for(int j=1;j<arr.length-1;j++)
                {
                    if(arr[j]<arr[j+1])
                    {
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                    
                }
            }
          for(int i=0;i<=arr.length-1;i++)
          {
            System.out.print(arr[i]+ " ");
          }
          System.out.println("enetr elmnt");
          int n=s.nextInt();
          System.out.println(arr[n]);
    }
}
