import java.util.Scanner;
class Circle {

    private  int r;
    private static double pi=3.14;

    public void  giveRadius(int r)
    {
        if(r>=7 && r<=21)
            {
            System.out.println("valid data" +r);
            this.r=r;
            }
        else
            {
                System.err.println("invalid data");
            }
    }
    
    public void display()
    {
        System.out.println("radius is" +r);
        System.out.println("pi is"+pi);
    }

    public void area( )
    {
        double area=pi*r*r;
        System.out.println("area is" + area);
    }

    public void circumference()
    {
        double circumference=2*pi*r;
        System.out.println("circumference");
    }

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);

        Circle c1= new Circle();
        c1.giveRadius(10);
        c1.display();
        c1.area();
        c1.circumference();

    }
    
}
