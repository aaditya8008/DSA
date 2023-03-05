import java.util.*;
public class duplicateinstr{
public static void removed(String str,int i,String newstr,boolean map[]){
if(i==str.length()){
    System.out.println(newstr);
    return;
}
char curr=str.charAt(i);
if(map[curr-'a']==true){
    removed(str,i=i+1,newstr,map);
}
else{
    map[curr-'a']=true;
    removed(str,i=i+1,newstr+=curr,map);
}

}

public static void main(String args[]){
String str;
Scanner sc=new Scanner(System.in);
System.out.println("Enter String : \n");
str=sc.nextLine();
int i=0;
String newstr="";
boolean map[]=new boolean[26];
removed(str,i,newstr,map);


}

}