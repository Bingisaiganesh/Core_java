 class Merge_array {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4};
        int b[]={5,6,7};
        int size=a.length+b.length;
        int Arr[]=new int[size];
        for(int i=0;i<=a.length-1;i++)
        {
            Arr[i] = a[i];
        }
        for(int i=0;i<=b.length-1;i++)
        {
            Arr[(a.length)+i] = b[i];
        }
       for (int i=0;i<=Arr.length-1;i++)
       {
        System.out.print(Arr[i]+", ");
       }

    }
}
