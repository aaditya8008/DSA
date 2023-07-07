import java.util.*;

public class linkedlistrep {
    public static class node {
        int data;
        node next;

        public node(int data) {
            x++;
            this.data = data;
            this.next = null;
        }
    }
    
    public node head;
    public node tail;
 public static int x=0;
    void firstadd(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
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

    void addmiddle(int data) {

        node newnode = new node(data);
        Scanner sc = new Scanner(System.in);
        node n = head;
        int tar;
        node x;
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            System.out.println("Enter node :\n");
            tar = sc.nextInt();
            n = head;
            while (n.data != tar && n != null) {
                n = n.next;
            }
            if (n.data == tar) {
                System.out.println("Found");
                newnode.next = n.next;
                n.next = newnode;

            } else {
                System.out.println("Not Found");

            }
            return;
        }

    }

void deletefirst(){
    head=head.next;
if(head==tail){
    head=null;
    tail=null;
}
}
void deleteend(){
    node n=head;
    if(head==tail){
    head=null;
    tail=null;
    return;
}
    while(n.next.next!=null&&n!=null){
n=n.next;
    }
    tail=n;
    tail.next=null;
}

void deletemiddle(){
    Scanner sc=new Scanner(System.in);
System.out.println("Enter number to delete :\n");
int x=sc.nextInt();
node n=head;

    if(head==tail){
    head=null;
    tail=null;
    return;
}
while(n.next.data!=x&&n!=null){
    n=n.next;
}
if(n!=null){
    node temp=n.next.next;
    n.next=temp;
}


}



    void print() {
        System.out.println("Data :\n");
        node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String args[]) {
       
        linkedlistrep newer = new linkedlistrep();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size :\n");
        int size = sc.nextInt();
        System.out.println("Enter data :\n");
        for (int i = 0; i < size; i++)
            newer.lastadd(sc.nextInt());
        newer.print();
        System.out.println("Enter new Data :\n");
        newer.addmiddle(sc.nextInt());
        newer.print();
newer.deletemiddle();
newer.print();
    }
}