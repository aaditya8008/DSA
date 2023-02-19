import java.util.*;

public class inheritence{    
    public static void main(String args[]){
      animal a1=new animal();
      fish f1=new fish();
      humans h1=new humans();
      h1.walk();
      h1.swims();
      f1.swims();
      f1.eat();
      f1.breathe();

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
class humans extends fish{
    void swims(){
        System.out.println("little Swims\n");
    }
    void walk(){
        System.out.println("walks\n");
    }

}