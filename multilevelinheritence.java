import java.util.*;
//single level inheritence
public class multilevelinheritence{    
    public static void main(String args[]){

      human h1=new human();
      h1.eat();
      h1.speak();
      h1.swims();
      h1.hands=4;
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
int hands;
void swims(){
    System.out.println("Swims\n");
}

}
class human extends fish{
    void speak(){
        System.out.println("Speak\n");
    }
}
