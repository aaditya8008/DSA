import java.util.*;
public class removeduplicatestr{
 public static void removeduplicate(String str,int i,StringBuilder newstr,boolean map[]){
  if(i==str.length()){
    System.out.println(newstr);
    return;
  }
  char curr=str.charAt(i);
  if(map[curr-'a']==true){
    removeduplicate(str,i+1,newstr,map);
  }
  else {
map[curr-'a']=true;
removeduplicate(str,i+1,newstr.append(curr),map);

  }
  
 }
public static void main(String args[]){
String str="apnacollege";
removeduplicate(str, 0, new StringBuilder(""), new boolean[26]);

}

}