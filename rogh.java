import java.lang.String;
import java.util.*;
public class rogh{
public static  class node{
int data;
node next;
node prev;
public  node(int data){
  this.data=data;
  this.next=null;
  this.prev=null;
}

}
public static node head;
public static node tail;
public static node temp;

public static void lastadd(int data){
node newnode=new node(data);
if(head==null){
head=newnode;
tail=newnode;
System.out.println(head.data);
}

else{
tail.next=newnode;
newnode.prev=tail;
tail=newnode;

}

}
public static node getmid(node head) {
  node slow = head;
  node fast = head.next;
  while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

  }
  System.out.println("MID:" + slow.data);
  return slow;

}

public static void zigzag(){
node left=head;
node mid=getmid(head);
node right=mid.next;
mid.next=null;

while(left!=null&&right!=null){
node nextl=left.next;
node nextr=right.next;
left.next=right;
right.next=nextl;
left=nextl;
right=nextr;

}


}

public static node reverse(){
node prv=null;
node curr=head;
node nxt=null;
while(curr!=null){
nxt=curr.next;
curr.next=prv;
curr.prev=nxt;

prv=curr;
curr=nxt;


}
tail=head;
head=prv;
return head;


}

public static void print(node head){
node n=head;
System.out.println("Data :");
while(n!=null){
  System.out.println(n.data);
  n=n.next;
}

}

public static void revprint(node tail){
node n=tail;
System.out.println("Rev Data :");
while(n!=null){
  System.out.println(n.data);
  n=n.prev;
}



}

  public static void main(String args[]){
rogh list=new rogh();
Scanner sc=new Scanner(System.in);
System.out.println("Enter Size :");
int x=sc.nextInt();
System.out.println("Enter Data :");
for(int i=0;i<x;i++){
lastadd( sc.nextInt());
}
print(head);

head=reverse();
print(head);
revprint(tail);
  }
}
