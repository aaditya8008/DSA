import java.util.*;
public class removeduplictestring{
    
    public static StringBuilder print(String str,int i,StringBuilder newstr,boolean map[]){
        if(i==str.length())
        return newstr;
    if((map[str.charAt(i)-'a'])!=true){
newstr.append(str.charAt(i));
map[str.charAt(i)-'a']=true;
    }
    

        return print(str,i+1,newstr,map);
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter String :");
String str=sc.nextLine();
StringBuilder newstr=new StringBuilder("");
boolean map[]=new boolean[26];
System.out.println(print(str,0,newstr,map));
System.out.println(newstr);
}

}

