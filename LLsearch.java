import java.util.*;

public class LLsearch{
    
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

public static int itersearch(int target){
node n=head;
Scanner sc=new Scanner(System.in);

int i=0;
while(n.data!=target&&n!=null){
    i++;
    n=n.next;
}
if(n.data==target){
    System.out.println("Found at :");
    return i;
}
else{
    return i;
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
    public static void main(String args[]){
        LLsearch list =new LLsearch();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size :");
        int size=sc.nextInt();
        System.out.println("Enter Data :");
        for(int i=0;i<size;i++)
        list.lastadd(sc.nextInt());
        print();
        System.out.println("Searching :");
        System.out.println("enter Target :\n");
int target=sc.nextInt();
         System.out.println(itersearch(target));
    }
}