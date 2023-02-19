import java.util.*;

public class constructors{    
    public static void main(String args[]){
     Student s1=new Student("GaNGU TELLI");              //constructer created
     
     System.out.println(s1.name);}

}
class Student{
String name;
int roll;
Student(String name){                                    //constructer call
this.name=name;


}

}
