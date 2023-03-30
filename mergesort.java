import java.util.*;
public class mergesort{



     public static void  mergesort(int arr[],int s,int e){
        if(s>=e)
        return;
        int mid=s+(e-s)/2;     //(s+e)/2
        mergesort(arr,s,mid);  //sorts left part
        mergesort(arr,mid+1,e); //sorts right part
        merge(arr,s,mid,e) ;
    }




    public static void  merge(int arr[],int s,int mid,int e){
    //left(0,3)=4, right(4,6)=3
     int temp[]=new int[e-s+1];
     int i=s;    //for rigth
     int j=mid+1;//for left
     int k=0;    //for temp
     while(i<=mid&&j<=e){
        if(arr[i]<arr[j]){             //merging both the divided part by sorting and comparing
            temp[k]=arr[i];
             i++;k++;
        }
        if(arr[i]>=arr[j]){
            temp[k]=arr[j];
             j++;k++;
        }
                 //k++;
     }
     while(i<=mid){
        temp[k++]=arr[i++];        //if only i elements left
     }
     while(j<=e){
        temp[k++]=arr[j++];        //if only j elements left
     }
        //copy
        for(k=0,i=s;k<temp.length;k++,i++){
        arr[i]=temp[k];

        }


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

mergesort(arr,0,arr.length-1);
print(arr);
}

}

