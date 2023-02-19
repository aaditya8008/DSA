import java.util.*;
 public class superkeyword{
public static void main(String args[]){
  horse h=new horse();
  System.out.println(h.color);
 }}

 class animal{   
  String color;
  animal(){                      //constructer
      System.out.println("Animal constructer called");  
  }
  }
  


  class horse extends animal{
      horse(){                   //constructer
        super();                   //call imidiate parent constructer
        super.color="brown";
      System.out.println("Horse constructer called");  }
     }
      class mustang extends horse{
          mustang(){                 //constructer
            
              System.out.println("Mustang constructer called");  }
      }
  