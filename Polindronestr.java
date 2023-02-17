import java.util.*;
public class Polindronestr{
public static boolean poli(String str){
   int s=0,e=str.length()-1;
   while(s<e){
    if(str.charAt(s++)!=str.charAt(e--))
    return false;

   }
   return true;

}



    
    public static void main(String args[]){
   String str;
   Scanner sc=new Scanner(System.in);
   str=sc.nextLine();
  System.out.println(poli(str)); 

}}