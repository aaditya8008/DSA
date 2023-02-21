import java.util.*;

public class shallowcopy{    
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Aadi"   ;
        s1. password="aass#123";
        s1.marks[0]=1  ;
        s1.marks[1]=2; 
        s1.marks[0]=3;
     Student s2=new Student(s1);              //constructer created
     s1.marks[0]=4;                      //affect as arr uses refrence
     System.out.println(s1.marks[0]+"\t"+s1.marks[1]+"\t"+s1.marks[2]+"\n");
     System.out.println(s2.marks[0]+"\t"+s2.marks[1]+"\t"+s2.marks[2]);}

}
class Student{
String name;
int marks[];
String password;
Student(){marks=new int[3];};
Student(Student s1){                                    //constructer call
    this.name=s1.name;
    marks=new int[3];
    this.password=s1.password;
     this.marks=s1.marks;

}

}

