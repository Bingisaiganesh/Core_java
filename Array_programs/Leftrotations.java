
import java.util.*;
class Leftrotations 
{
    public static int[] Rotation(int[]a,int n)
    {
        for(int x=0;x<=n;x++)
        {
        int temp=a[0];
        for(int i=1;i<=a.length-1;i++)
        {
            a[i-1]=a[i];

        }
        a[a.length-1]=temp;
    }
        return a;
    }


    public static void main(String[] args) 
    {
        Scanner s =new Scanner(System.in);
        System.out.println("enter array size");
        int size=s.nextInt();
        int [] a= new int[size];
        System.out.println("enter elements into array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("enter how many rotations");
        int n=s.nextInt();
        System.out.println(Arrays.toString(Rotation(a,n)));

    }
    
}
