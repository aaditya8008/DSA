import java.util.*;
public class rogh{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter Num :\n");
int x=sc.nextInt();
int y=sc.nextInt();
int count=0;
while(x>0){
    if(((x)&1)!=0)
    count++;
     x=x>>1;
}
System.out.println(count);

}
}