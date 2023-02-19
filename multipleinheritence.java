import java.util.*;
public class multipleinheritence{
public static void main(String args[]){
Omnivores O=new Omnivores();
O.veg();
O.nonveg();
O.result();

}
}
interface herbivores{
void veg();

}
interface carnivores{
void nonveg();

}
 
class Omnivores implements herbivores,carnivores{
public void veg(){
    System.out.println("Vegeterian");
}
public void nonveg(){
    System.out.println("Non-Vegeterian");
}
void result(){
    System.out.println("Can eat both Veg and Non-Veg");
}


}