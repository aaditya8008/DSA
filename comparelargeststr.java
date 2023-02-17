import java.util.*;
public class comparelargeststr{
    public static void main(String args[]){
   

   Scanner sc=new Scanner(System.in);
   String str[]={"aaple","mango","banana"};
   String str2=str[0];
   for(int i=1;i< str.length;i++){
  System.out.println(str2.compareTo(str[i])); 
  if(str2.compareTo(str[i])<0)
  str2=str[i];
   }System.out.println(str2);
}

}