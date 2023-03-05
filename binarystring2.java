import java.util.*;
public class binarystring2{
public static void removed(String str,int n,int lp){
if(n==0){
  System.out.println(str);
return;
}
removed(str+"0",n-1,0);
if(lp==0){
removed(str+"1",n-1,1);

}


}

public static void main(String args[]){
String str;
Scanner sc=new Scanner(System.in);
System.out.println("Enter num : \n");
int n=sc.nextInt();

int lp=0;
str="";
boolean map[]=new boolean[26];
removed(str,n,lp);


}

}