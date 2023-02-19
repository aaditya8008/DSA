import java.util.*;
//single level inheritence
public class methodoverriding{    
    public static void main(String args[]){
        animal a1=new animal();
      human h1=new human();
      fish f1=new fish();
      a1.eat();
      h1.eat();
      f1.eat();
      

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
void eat(){
    System.out.println("eats fish\n");
}

}
class human extends animal{
    void eat(){
        System.out.println("eat anything\n");
    }
}

