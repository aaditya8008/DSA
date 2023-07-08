import java.util.*;

public class doublyll{
    
public static class node{
int data;
node next;
node prev=null;
node(int data){
this.data=data;
this.next=null;
node prev=null;
}
}
static node head;
static node tail;

public static void lastadd(int data){
    node newnode=new node(data);
    if(head==null){
        head=newnode;
        tail=newnode;
        head.prev=null;
    }
    else{
        newnode.prev=tail;
        tail.next=newnode;
        tail=newnode;
        tail.next=null;
    }

}




    public static void print(){
        node n=head;
         System.out.println("Data :");
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
    public static void printrev(){
        node n=tail;
         System.out.println("Data :");
        while(n!=null){
            System.out.println(n.data);
            n=n.prev;
        }
    }
    public static void main(String args[]){
        doublyll list =new doublyll();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size :");
        int size=sc.nextInt();
        System.out.println("Enter Data :");
        for(int i=0;i<size;i++)
        list.lastadd(sc.nextInt());
        printrev();
        
    }
}