import java.util.*;
public class linkedlist{
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
           this. next=null;
        }
    }
    public static node head;
    public static node tail;


    public static void addfirst(int data){
Scanner sc=new  Scanner(System.in);
System.out.println("Enter new node :");
node n=new node(data);
if(head==null){
    head=tail=n;
    return;
}
n.next=head;
head=n;

    }
    public static void addlast(int data){
node n=new node(data);
if(head==null){
    
}
tail=n;
tail.next=n;


    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter size :");
int size=sc.nextInt();
linkedlist ll=new linkedlist();
int data;
for(int i=0;i<size;i++){
    data=sc.nextInt();
addfirst(data);

}
addlast(8);
while(head!=null){
    System.out.println(head.data);
    head=head.next;
}
}
}
