
import java.util.*;
public class statickeyword{
public static void main(String args[]){
Student s1=new Student();
Student s2=new Student();
Student s3=new Student();
s1.schoolname="JMV";
System.out.println(s1.schoolname);
System.out.println(s2.schoolname);  /*as static is declared in s1 or also
                                    can be s2 but once declared remains 
                                    same for all classes*/
System.out.println(s3.schoolname);
s3.schoolname="SXR's";              //changed for all
System.out.println(s1.schoolname);
System.out.println(s2.schoolname);     
System.out.println(s3.schoolname);
System.out.println("Percentage = "+s1.returnpercentage(1,2,3)+"%");
//static functions
}

}

class Student{
 String name;
 int roll;
 static String schoolname;
 void setname(String name){
   this.name=name;
 }
 String getname(){
   return this.name;
 }


 static int returnpercentage(int math,int cs,int chem){
return ((math+chem+cs)/3)*100;

 }
}