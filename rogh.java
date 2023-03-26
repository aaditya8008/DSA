import java.util.*;
public class rogh{
public static void main(String args[]){
student s1=new student();
System.out.println(s1.schooln);
s1.schooln="XYZ";
student s2=new student ();
System.out.println(s2.schooln);
}
}
class student{
String name;
int roll;
static String schooln="Rancho";
void setname(String name){
    this.name=name;
}
String getname(){
    return this.name;
}

}