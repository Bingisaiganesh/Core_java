class MarkerValidateMethod1 {
    String Brand;
    String Color;
    int Cost;

    public void validateBrand(String a)
    {
       if(a.equalsIgnoreCase("cello") || a.equalsIgnoreCase("natraj")
        || a.equalsIgnoreCase("apsara") )
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }
    }

    public void validateColor(String b)
    {
        if(b.equalsIgnoreCase("yellow") || b.equalsIgnoreCase("pink"))
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invlaid");
        }
    }
    
    public void validateCost(int c)
    {
        if(c>=30 && c<=100)
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
        MarkerValidateMethod1 m=new MarkerValidateMethod1();
        m.validateBrand("apsara");
        m.validateColor("pink");
        m.validateCost(40);
        
    }
    
}
