import java.util.*;
public class rogh{
    
    public static int print(int x){
    if(x==0||x==1)
    return 1 ;
    
        return (print(x-1)+print(x-2));
        
    }
public static void main(String args[]){
    System.out.println("Enter size :\n");
int x;
Scanner sc=new Scanner(System.in);
System.out.println("Enter num :");
x=sc.nextInt();
System.out.println(print(x));

}

}

