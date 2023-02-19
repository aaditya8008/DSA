import java.util.*;
//single level inheritence
public class hierchicalinheritence{    
    public static void main(String args[]){

      human h1=new human();
      fish f1=new fish();
      tuna t1=new tuna();
      h1.eat();
      h1.speak();
      f1.eat();
      f1.swims();
      t1.iam();

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
class tuna extends fish{              //hybrid
    void iam(){
        System.out.println("Tuna\n");
    }
}