import java.util.*;
//single level inheritence
public class methodoverloading{    
    public static void main(String args[]){
        Calculator c1=new Calculator();
   System.out.println(c1.sum(3,2)); 
   System.out.print(c1.sum(3.13f,2.13f));
}}
class Calculator{                //base class
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
      return a+b;
    }
}