import java.util.*;

public class constructorhierchyabstract{    
    public static void main(String args[]){
    mustang m=new mustang();
    //Animal->Horse->Mustang
    }}
abstract class animal{   
    String color;
    animal(){                      //constructer
        System.out.println("Animal constructer called");  
    }
    void eat(){
        System.out.println("Eats\n");

    }
    abstract void walk();}    


    class horse extends animal{
        horse(){                   //constructer
        System.out.println("Horse constructer called");  }
        void changecolor(){
        color="dark brown";
       }
        void walk(){
            System.out.println("walks on 4 legs\n");
        }}



        class mustang extends horse{
            mustang(){                 //constructer
                System.out.println("Mustang constructer called");  }
            void changecolor(){
                color="yellow";
               }
            void walk(){
                System.out.println("walks on 2 legs\n");
            }
        }
    