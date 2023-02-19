import java.util.*;
public class accessingprivateclass{
public static void main(String args[]){
pen p=new pen();
p.tip=1;
System.out.println("Tip:"+p.tip+"\n"+"Color:"+p.change("red"));

}

}
 class pen {
    private String color;
    int tip;
    String change(String color){
    this.color=color;
    return this.color;

    }

 }