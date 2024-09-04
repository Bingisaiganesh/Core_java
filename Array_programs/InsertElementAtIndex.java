
import java.util.Arrays;
import java.util.Scanner;
class InsertElementAtIndex {

    public static int[] Insert(int a[],int n, int index)
    {
        int b[]=new int[a.length+1];
         for(int i=0;i<=b.length-1;i++)
         {
            if(i<=index)
            {
                b[i]=a[i];
            }
            else if
            {
                b[index]=n;
            }
            else
            {
                b[i]=a[i-1];
            }
         }
         return b;
    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       System.out.println("enter array size");
       int size=s.nextInt();
       int a[]=new int[size];
       for(int i=0;i<=a.length-1;i++)
       {
        System.out.println("eneter elmnt");
        a[i]=s.nextInt();
       }
       System.out.println("entr which elemnt");
       int n=s.nextInt();
       System.out.println("enter at what index");
       int index=s.nextInt();
       System.out.println(Arrays.toString(Insert(a,n,index)));
    }
    
}
