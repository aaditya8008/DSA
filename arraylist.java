import java.util.ArrayList;
public class arraylist{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();
         //adding elements == O(1)
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(6);
        //get()list elements == O(n)
        System.out.println("Get :"+list.get(1));

        //removing element ==O(n);
        list.remove(3);
        System.out.println("Remove :"+list);
        
        //setting value ==O(n);
        list.set(2,3);
        System.out.println("set:"+list);

        //contain element x
        System.out.println("contain: "+list.contains(1));
        // add with index ==//0(n)
        list.add(1,9);
        System.out.println("Index Add :"+list);

        //size
        System.out.println("Size :"+list.size());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}