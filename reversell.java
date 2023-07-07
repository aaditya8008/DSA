import java.util.*;

public class reversell{
    
public static class node{
int data;
node next;
node(int data){
this.data=data;
this.next=null;
}
}
static node head;
static node tail;

public static void lastadd(int data){
    node newnode=new node(data);
    if(head==null){
        head=newnode;
        tail=newnode;
    }
    else{
        tail.next=newnode;
        tail=newnode;
        tail.next=null;
    }

}

public static void  reverse(){
node current=head;
node prev=null;
node nxt=null;
while(current!=null){
  nxt=current.next;
  current.next=prev;
  prev=current;
  current=nxt;
}
head=prev;

}


    public static void print(){
        node n=head;
         System.out.println("Data :");
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
    public static void main(String args[]){
        reversell list =new reversell();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size :");
        int size=sc.nextInt();
        System.out.println("Enter Data :");
        for(int i=0;i<size;i++)
        list.lastadd(sc.nextInt());
        print();
        System.out.println("Reverse :");
      reverse();
      print();
      print();
    }
}