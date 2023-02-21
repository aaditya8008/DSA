import java.util.*;
import java.util.Collections;;
public class rogh{
    public static void countingsort(int arr[],int n){
        int largest =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
     largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
int j=0;
for(int i=0;i<count.length;i++){
while(count[i]>0){
arr[j]=i;
j++;
count[i]--;

}

}
for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
      }
}


    public static void main(String args[]){
        int n;
    Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
     }
     countingsort(arr,n);
    }
}
