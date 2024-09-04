class Balloon {
    private String color;
    
    public void giveColor(String s)
    {
        if(color.equalsIgnoreCase("red") || color.equalsIgnoreCase("green"))
        {
            System.out.println("valid"+s);
            this.color=s;

        }
        else
        {
            System.err.println("invalid");
        }

    }

    public static void main(String[] args) {
        Balloon b1=new Balloon();
        Balloon b2=new Balloon();
        b1.giveColor("red");
        b2.giveColor("pink");

    }
    
}
