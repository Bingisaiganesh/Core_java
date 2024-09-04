
class Document
{
    public String filename;
    public String filetype;
    public int size;
    public static String storageloc="D:drive";
}

public class Mainclass4 {
    public static void main(String[] args)
    {
        Document d1=new Document();
        Document d2=new Document();
        d1.filename="circle";
        d1.filetype="pdf";
        d1.size=5;
        d2.filename="rectangle";
        d2.filetype="doc";
        d2.size=20;
        int newsize1_kb=d1.size*1024;
        int newsize2_kb=d2.size*1024;

        System.out.println("All the docs are stored in "+ Document.storageloc);

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println(d1.filename+" is filename , "+d1.filetype+" is filetype,   "+newsize1_kb+" is size");
        System.out.println(d2.filename+" is filename  , "+d2.filetype+"  is filetype,   "+newsize2_kb + " is size");
    
    }
    
}
