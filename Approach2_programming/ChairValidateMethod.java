 class ChairValidateMethod
  {
    String color;
    int height;

    public void validateColor(String a)
    {
        if(a.equalsIgnoreCase("white") || a.equalsIgnoreCase("red") )
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }
    }

    public void validateHeight(int b)
    {
        if(b>=10 && b<=50)
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }
    }
    


    public static void main(String[] args) {

        ChairValidateMethod c= new ChairValidateMethod();
        c.validateColor("orange");
        c.validateHeight(20);
        
    }
}
