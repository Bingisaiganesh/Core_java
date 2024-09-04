import java.util.Scanner;
public class Position_of_element {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6};
        Scanner s=new Scanner(System.in);
        System.out.println("enter which element position to find");
        int element=s.nextInt();
        int index=-1;
        // bcs
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]==element)
            {
                index=i;
            }
        }
        System.out.println(index);

    }
}
