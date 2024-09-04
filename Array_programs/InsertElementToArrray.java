import java.util.Arrays;
import java.util.Scanner;
class InsertElementToArrray {
    public static int[] Insert(int []a,int n)
    {
        int b[]=new int[a.length+1];
        for(int i=0;i<b.length-1;i++)
        {
            b[i]=a[i];
        }
        b[b.length-1]=n;
        return b;
    }


    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
        System.out.println("enter array size");
        int size=s.nextInt();
        int []a = new int[size];
        System.out.println("enter elements int to array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("enter n value to insert");
        int n=s.nextInt();
        System.out.println(Arrays.toString(Insert(a,n)));
    }
    
}
