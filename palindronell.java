import java.util.*;

class palindronell {
    public static class node {
        int data;
        node next;

        node(int data) {
            count++;
            this.data = data;
            this.next = null;
        }
    }
    static node head;
    static node tail;
    static int count = 0;
  public static node findmid(){
node slow=head;
node fast=head;
while(fast!=null&&fast.next!=null){
slow=slow.next;
fast=fast.next.next;

}
System.out.println("MID:"+slow.data);
return slow;

}
    

    void lastadd(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;

        }

    }

  

    public static node reverse(){
node current=findmid();
node n=head;

while(n.next!=current){
    n=n.next;
}
node prev=null;
node nxt=null;
while(current!=null){
  nxt=current.next;
  current.next=prev;
  prev=current;
  current=nxt;
}
n.next=prev;
return prev;
}
public static void ispalindrone(){
if(head==null||head.next==null){
    System.out.println("True");
    return;
}
node n1=head;
node n2=reverse();
    node limit=n2;
while(n2!=null&&n1!=limit){
    
    if(n1.data!=n2.data){
        System.out.println("Flase");
        return ;
    }
    n1=n1.next;
    n2=n2.next;
}
 System.out.println("True");
 return;
}




    public static void print() {
        node n = head;
        System.out.println("Data :");
        while (n != null) {
            System.out.println(n.data);
            n = n.next;

        }

    }

    public static void main(String args[]) {
        palindronell list = new palindronell();
        System.out.println("Enter Size :\n");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter Data :\n");
        for (int i = 0; i < size; i++) {
            list.lastadd(sc.nextInt());
        }
        list.print();
        System.out.println("Palindrone:");
        
       list.ispalindrone();
    }

}