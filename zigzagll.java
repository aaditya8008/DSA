import java.util.*;

class zigzagll {
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
    static node head2;
    static int count = 0;
 
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

  



public static void zigzag(){
node slow=head;
node fast=head.next;
while(fast!=null&&fast.next!=null){
slow=slow.next;
fast=fast.next.next;

}
node mid=slow;
node curr=mid.next;
mid.next=null;
node prev=null;
node next;
while(curr!=null){
  next=curr.next;
  curr.next=prev;
  prev=curr;
  curr=next;
}
node left=head;
node right=prev;
node nextl,nextr;

while(left!=null&&right!=null){
nextl=left.next;
left.next=right;
nextr=right.next;
right.next=nextl;
left =nextl;
right=nextr;


}

}




    public static void print(node h) {
        node n = h;
        System.out.println("Data :");
        while (n != null) {
            System.out.println(n.data);
            n = n.next;

        }

    }

    public static void main(String args[]) {
        zigzagll list = new zigzagll();
        System.out.println("Enter Size :\n");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter Data :\n");
        for (int i = 0; i < size; i++) {
            list.lastadd(sc.nextInt());
        }
        list.print(head);
      
       list.zigzag();
        list.print(head);
    }

}