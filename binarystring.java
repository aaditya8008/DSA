import java.util.*;
public class binarystring{
 public static void totalways(int n,int lp,String str){
    if(n==0){
        System.out.println(str);
        return;
    } 
    
    
    totalways(n-1,0,(str+"0"));
    if(lp==0)

totalways(n-1,1,(str+"1"));
}

 
 

public static void main(String args[]){
totalways(3,0,new String(""));
}
}
