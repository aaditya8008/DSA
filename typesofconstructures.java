import java.util.*;

public class rogh{    
    public static void main(String args[]){
     Student s1=new Student();              //constructer created
     Student s2=new Student("Aadi"); 
     Student s3=new Student(3); 
     System.out.println(s1.name+"\n"+s2.name+"\n"+s3.roll);}

}
class Student{
String name;
int roll;
Student(){                                    //constructer call
    System.out.println("Constructor is called..!");


}
Student(String name){                  //parametrized constructor                                  //constructer call
    this.name=name;
    
    
    }

    Student(int roll){                  //parametrized constructor                                  //constructer call
        this.roll=roll;
        
        
        }
    
}