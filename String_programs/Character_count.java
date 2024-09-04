import java.util.Scanner;
class Character_count {
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter any string");
        String x=s.nextLine();
        int alphacount=0;
        int digitcount=0;
        int symbolcount=0;
        for (int i=0;i<=x.length()-1;i++)
        {
            char ch=x.charAt(i);
            if((ch >='A' && ch<='Z') || (ch>='a' && ch<='z'))
            {
                alphacount++;
            }
            else if(ch>=0 && ch<=9)
            {
                digitcount++;
            }
            else
            {
                symbolcount++;
            }
        }

        System.out.println("Alpha count is" + alphacount);
        System.out.println("digit count is" + digitcount);
        System.out.println("symbol count is" + symbolcount);
    }
  

    
}
