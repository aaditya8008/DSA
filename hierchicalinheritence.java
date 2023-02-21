import java.util.*;
//single level inheritence
public class hierchicalinheritence{    
    public static void main(String args[]){

      human h1=new human();
      fish f1=new fish();
      h1.eat();
      h1.speak();
      f1.eat();
      f1.swims();

}}
class animal{                //base class
    String color;
    void eat(){
        System.out.println("Eats\n");

    }
    void breathe(){
        System.out.println("Breathes\n");
    }
}
//derived class
class fish extends animal{        //allproperties of animal copied
int fins;
void swims(){
    System.out.println("Swims\n");
}

}
class human extends animal{
    void speak(){
        System.out.println("Speak\n");
    }
}