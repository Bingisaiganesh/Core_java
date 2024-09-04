
import java.util.Scanner;
class Reverse_string
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a string");
        // String name=s.next();
        String name=s.nextLine();
        String res=" ";
        for(int i=0;i<=name.length()-1;i++)
        {
            res = name.charAt(i)+res;
        }
        System.out.println(res);
    }

}