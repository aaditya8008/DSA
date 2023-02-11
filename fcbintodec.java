import java.util.*;
public class fcbintodec{
    public static int Converted(int n){
        int rem,i=0;
        int value=0;
    while(n!=0){
     rem=n%10;
    value=value+(rem*(int)Math.pow(2,i));
     n=n/10;
     i++;
    }
    return value;

    }
    public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     System.out.println(Converted(n));
    }
}