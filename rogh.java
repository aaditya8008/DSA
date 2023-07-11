import java.util.*;



public class rogh{
public static void pushbottom(Stack s,int data){
  if(s.isEmpty()){
    s.push(data);
    return ;
  }
  int x=(int)s.pop();
pushbottom(s, data);
s.push(x);

  


}
public static void reverse(Stack s){
  if(s.isEmpty()){
  
    return ;
  }
  int x=(int)s.pop();
reverse(s);
pushbottom(s,x);

  


}


public static void main(String args[]){
Stack<Integer> s=new Stack<>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter Size :");
int size=sc.nextInt();

for(int i=0;i<size;i++){
  s.push(sc.nextInt());
}



reverse(s);
System.out.println("Enter Data:");
Stack n=s;
while(!n.isEmpty()){
  System.out.println(n.peek());
  n.pop();
}
}


}