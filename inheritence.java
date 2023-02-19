import java.util.*;

public class inheritence{    
    public static void main(String args[]){
      animal a1=new animal();
      fish f1=new fish();
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