class BaloonValidateMethod2 
{

    String color;

    public void validateColor(String a)
    {
        if(a.equalsIgnoreCase("red") || a.equalsIgnoreCase("yellow"))
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }
    }
    
    public static void main(String[] args)
    {
        BaloonValidateMethod2 b= new BaloonValidateMethod2();
        b.validateColor("yellow");
    }
    
}
