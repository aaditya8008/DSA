import java.util.*;
public class rogh{
public static String substring(String str){
    String sub="";
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    int e=sc.nextInt();
    for(int i=s;i<e;i++){
        sub+=str.charAt(i);
    }

   return sub;
}



    
    public static void main(String args[]){
   String str;
   Scanner sc=new Scanner(System.in);
   str=sc.nextLine();
  System.out.println(substring(str)); 

}
}