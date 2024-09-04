

 class DocumentValidateMethods {
    String fileNAme;
    String fileType;
    int fileSize;

    public void validatefileName(String h)
    {
            for(int i=0;i<=h.length();i++)
            {
                if(h.charAt(i)>='a' && h.charAt(i)<='z' && h.charAt(i)>=0 && h.charAt(i)<=9 && h.charAt(i)=='_' )
                    {
                        System.out.println("valid");
                    }
                else
                    {
                        System.out.println("invalid");
                    }
            }
    }

    public void validatefileType(String b)
    {
        if(b.equalsIgnoreCase("pdf") || b.equalsIgnoreCase("doc"))
        {
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
    }

    public void validatefileSize(int c)
    {
        if(c>=10 && c<=50)
        {
            System.out.println("valod");
        }
        else{
            System.out.println("invalid");
        }
    }


    public static void main(String[] args) {
        DocumentValidateMethods d= new DocumentValidateMethods();
        d.validatefileName("sai_ganesh09");
        d.validatefileType("pdf");
        d.validatefileSize(20);
    }

}
