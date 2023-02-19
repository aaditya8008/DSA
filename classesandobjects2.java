import java.util.*;
public class classesandobjects2{
    public static void main(String args[]){
    Student s1=new Student();
    s1.upload("Aadi", 1, 8.6f);
System.out.println(s1.name+"\t"+s1.rollno+"\t"+s1.cgpa);
    }
}
class Student{
String name;
int rollno;
float cgpa;
void upload(String typename,int typerollno,float typecgpa){
    name=typename;
    rollno=typerollno;
    cgpa=typecgpa;
}

}