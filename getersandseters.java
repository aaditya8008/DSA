import java.util.*;

public class getersandseters{     
    public static void main(String args[]){
    pen p1=new pen();
    p1.setcolor("Blue");
    System.out.println(p1.getcolor());      //accessing private by functions
    p1.settip(5);
    System.out.println(p1.tip);
    }
}
class pen{
private String color;
int tip;
String getcolor(){
    return this.color;                      //getrs
}
void setcolor(String newcolor){        //sters
color=newcolor;

}
void settip(int newtip){               //setrs
    tip=newtip;
}

}
