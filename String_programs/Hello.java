import java.util.Scanner;
class Hello

{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any string");
        String x=s.nextLine();
        for(int i=0;i<=x.length()-1;i++)
        {
            System.out.println(x.charAt(i));
        }


    }
}