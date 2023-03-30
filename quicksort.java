import java.util.*;
public class quicksort{


     public static void  quicksort(int arr[],int s,int e){
        if(s>=e){
            return;
        }
      int pidx=partition(arr,s,e);     //index of chosen pivot
quicksort(arr, s, pidx-1);      //left
quicksort(arr, pidx+1, e);      //right

    }
    public static int  partition(int arr[],int s,int e){
        int pivot=arr[e];           //last index chosen
        int i=s-1;                 //gives space to elements smaller than pivot
        for(int j=s;j<e;j++){
         if(arr[j]<=pivot){
            i++;
            //swap
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
         }

        }
        i++;
        int temp=pivot;
            arr[e]=arr[i];      //pivot ar middle of smaller and larger
            arr[i]=temp;
            return i;
    }



    public static void  print(int arr[]){
        System.out.println("Sorted elements are :");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }



public static void main(String args[]){
int size;
Scanner sc=new Scanner(System.in);
System.out.println("SIZE :");
size=sc.nextInt();
int arr[]=new int[size];

System.out.println("ELEMENTS :");
for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
}

quicksort(arr,0,arr.length-1);
print(arr);
}

}
