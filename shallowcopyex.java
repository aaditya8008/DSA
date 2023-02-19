import java.util.*;
public class shallowcopyex{
public static void main(String args[]){
pen p=new pen(5);
p.tip[0]=1;
p.tip[1]=2;
p.tip[2]=3;
p.color="green";
pen p1=new pen(p);
p.tip[2]=100;
System.out.println("Tip:"+p1.tip[0]+"\n"+p1.tip[1]+"\n"+p1.tip[2]+"\n"+"Color:"+p1.color);

}

}
 class pen {                    //class
    String color;       //objects
    int tip[];
    String change(String color){
    this.color=color;
    return this.color;

    }
    pen(pen p){
       this.tip=new int[3];
    this.color=p.color;
    
    this.tip=p.tip;

    }
pen (int  tip){
    this.tip=new int[3];
    System.out.println( "Tip size ="+tip);


}
 }