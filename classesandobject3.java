import java.util.*;
public class rogh{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
Bank b1=new Bank();
b1.data("Aaditya","Aa123#!",27);
b1.name=sc.nextLine();
System.out.println("NAME:"+b1.name+"\nAGE:"+b1.age+"\nPASSWORD:"+b1.password);

    }
}
class Bank{
String name;
String password;
int age;
void data(String name,String password,int age){
    this.name=name;
    this.password=password;
    this.age=age;
}

}