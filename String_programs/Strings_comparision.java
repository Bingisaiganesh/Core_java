import java.util.Scanner;
class Strings_comparision
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter any string");
         String s1= sc.nextLine();
         System.out.println("enter any string");
         String s2=sc.nextLine();
         boolean isSame=true;

         if(s1.length() != s2.length())
         {
            System.out.println("not equal by lengths");
         }

         else
         {
            for(int i=0;i<=s1.length()-1;i++)
            {
                if(s1.charAt(i) != s2.charAt(i))
                {
                    isSame=false;
                    break;
                }
            }
         }
         if(isSame)
         {
            System.out.println("Strings are equal");
         }
         else
        {
            System.out.println("Strings aare not equal");
        }
    }
}