import java.util.Scanner;
class toUpperCase_toLowerCase 
{

    public static String lowerCase(String s)
    {
        String ans="";
        for(int i=0;i<=s.length()-1;i++)
        {
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                ch=(char)(ch+32);
                // A+32= (here it is + so it converts char to alpha and addition performs)65+32=97 ..char(97)=a;
            }
            ans=ans+ch;
        }
        return ans;
    }

    public static String upperCase(String s)
    {
        String ans="";
        for(int i=0;i<=s.length()-1;i++)
        {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z')
            {
                ch=(char)(ch-32);
            }
            ans=ans+ch;
        }
        return ans;
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("lower case  : " +lowerCase(s) );
        System.out.println("lower case  : " +upperCase(s) );
    }
    
    
}
