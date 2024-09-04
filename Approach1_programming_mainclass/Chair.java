class program{
    public int height;
    public String color;
}

public class Chair 
{
    public static void main(String[] args){
        program c1=new program();
        program c2=new program();
        c1.height=50;
        c2.height=100;
        c1.color="red";
        c2.color="white";
        System.out.println(c1.color);

    }

}
