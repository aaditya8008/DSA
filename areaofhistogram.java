import java.util.*;

public class areaofhistogram{
public static int area(Stack s,int size){
    Stack n=s;
    int Min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    int area=0;
    int count=1;
    int extra;
    int x=0;
for(int i=0;i<size;i++){
n=s;

while(!n.isEmpty()){
    x=(int)n.peek();
     extra=(int)n.peek();
    if(x>extra){
       
Min=Math.min((int)s.peek(),(int)n.peek());
area=count*Min;
max=Math.max(max,Min);
n.pop();
count++;
    }
}
s.pop();


}
return max;

}



public static void main(String args[]){
Stack<Integer> s=new Stack();
Scanner sc=new Scanner(System.in);
System.out.println("Enter Size :");
int size=sc.nextInt();
for(int i=0;i<size;i++){
    s.push(sc.nextInt());
}
System.out.println("Data :");
System.out.println(s);
System.out.println(area(s,size));


}


}