import java.util.*;
public class constructorex{
public static void main(String args[]){
pen p=new pen(5);
pen p1=new pen();
p.tip=1;
System.out.println("Tip:"+p.tip+"\n"+"Color:"+p.change("red"));

}

}
 class pen {                    //class
    private String color;       //objects
    int tip;
    String change(String color){
    this.color=color;
    return this.color;

    }
    pen(){
    System.out.println( "Pen of metal");

    }
pen (int  tip){
    System.out.println( "Tip size ="+tip);

}
 }