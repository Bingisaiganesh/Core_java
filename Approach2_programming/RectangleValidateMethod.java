

class RectangleValidateMethod {
    
    String color;
    int height;
    int width;
     public void validateColor(String a)
     {
        if(a.equalsIgnoreCase("red") || a.equalsIgnoreCase("blue"))
        {
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
     }

     public void validateHeight(int b)
     {
        if(b>=10 && b<=20)
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }
     }
     public void validateWidth(int c)
     {
        if(c>=30 && c<=50)
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }
     }

     public static void main(String[] args) {
        RectangleValidateMethod r= new RectangleValidateMethod();
        r.validateColor("pink");
        r.validateWidth(20);
        r.validateHeight(20);

     }
}
