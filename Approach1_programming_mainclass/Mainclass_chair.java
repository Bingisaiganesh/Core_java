package Approach1_programming_mainclass;
import Approach1_programming.Chair;
public class Mainclass_chair {
    public static void main(String[] args){
        Chair c1=new Chair();
        Chair c2=new Chair();
        c1.height=50;
        c2.height=100;
        c1.color="red";
        c2.color="white";
        System.out.println(c1.color);

    }

}
