import java.util.*;
public class Triangle01{
    public static void invert(int n){
    for(int i=0;i<n;i++){
        for(int c=0;c<i;c++){
            if((i+c)%2==0)
            System.out.print("0");
            else 
            System.out.print("1");
        }
        System.out.println();
    }

    }
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
invert(n);


}

}