import java.util.*;
public class rogh{
public static int path(String str){
    int x=0,y=0;
   for(int i=0;i<str.length();i++){
    if(str.charAt(i)=='w'||str.charAt(i)=='W')
    x--;
    else if(str.charAt(i)=='e'||str.charAt(i)=='E')
    x++;
    else if(str.charAt(i)=='n'||str.charAt(i)=='N')
    y++;
    else if(str.charAt(i)=='s'||str.charAt(i)=='S')
    y--;
    
   }
   int X=x*x;
   int Y=y*y;
   return (int)Math.sqrt(X+Y);
}



    
    public static void main(String args[]){
   String str;
   Scanner sc=new Scanner(System.in);
   str=sc.nextLine();
  System.out.println(path(str)); 

}
}