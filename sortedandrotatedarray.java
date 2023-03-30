import java.util.*;
public class sortedandrotatedarray{
            public static int search(int arr[],int t,int s,int e){
          if(s>e)
          return -1;    //base case

                int mid=s+(e-s)/2;
                if(arr[mid]==t){
                    return mid;
                }
                //mid on L1 side
                if(arr[s]<=arr[mid]){
                //for left side
                if(arr[s]<=t&&t<=arr[mid]){
                return search(arr,t,s,mid-1);      //e = mid-1
                }
                //for roght
                else{
                    return search(arr,t,mid+1,e); //s=mid+1
                }

                }

                //mid on L2 side
                else{
                    //for roght 
                 if(arr[mid]<=t&&t<=arr[e]){
                    return search(arr,t,mid+1,e);
                 }
                 else{
                    //for left
                    return search(arr,t,s,mid-1);
                 }

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
int target=0;         //  o/p= index of 0
int taridx=search(arr,target,0,arr.length-1);
System.out.println("Index is :");
System.out.println(taridx);
}

}


