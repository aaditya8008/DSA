import java.util.*;
public class friendzpairing{
    
    public static int  print(int n){
if(n==1||n==2)
return n;
//     single      choicesrenaining * pair
return(print(n-1)+(n-1)*print(n-2));    
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
System.out.println(print(n));

}

}

