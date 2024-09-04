 class Marker 
{
    private int markerHeight;

    public void giveHeight(int markerHeight)
    {
        if(markerHeight>=10 && markerHeight <= 20)
        {
            System.out.println("valid");
            this.markerHeight=markerHeight;
        }
        else
        {
            System.out.println("invalid height");
        }
    }

    public static void main(String[] args) 
    {
        Marker m1=new Marker();
        m1.giveHeight(20);
    }
}
