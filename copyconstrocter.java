import java.util.*;

public class copyconstrocter{    
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Aadi"   ;
        s1.roll=3; 
        s1. password="aass#123";
     Student s2=new Student(s1);              //constructer created
     System.out.println(s1.name+"\n"+s1.roll+"\n"+s1.password);
     System.out.println(s2.name+"\n"+s2.roll+"\n"+s2.password);}

}
class Student{
String name;
int roll;
String password;
Student(){};
Student(Student s1){                                    //constructer call
    this.name=s1.name;
    this.roll=s1.roll;
    this.password=s1.password;


}

}
