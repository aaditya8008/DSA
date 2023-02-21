import java.util.*;

public class abstractclasses{    
    public static void main(String args[]){
      
      horse h=new horse();
      h.eat();
      h.walk();
      chicken c=new chicken();
      c.eat();
      c.walk();
      System.out.println(h.color);     //by default brown will be set by animal() constructer
                   //parent constructor called first by default


h.changecolor();     //changed
c.changecolor();
                   System.out.println(h.color);  
      System.out.println(c.color);                           }}
abstract class animal{             //can't be used by own    
    String color;
    animal(){                      //constructer
        color="brown";
    }
    void eat(){
        System.out.println("Eats\n");

    }
    abstract void walk();                //only gives function

}     
    class horse extends animal{          //abstract method will be implemented here compulsary
       void changecolor(){
        color="dark brown";
       }
        void walk(){
            System.out.println("walks on 4 legs\n");
        }}
        class chicken extends animal{
            void changecolor(){
                color="yellow";
               }
            void walk(){
                System.out.println("walks on 2 legs\n");
            }
        }
    