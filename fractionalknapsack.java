import java.util.*;

public class fractionalknapsack{
public static void main(String args[]){
int value[]={60,100,120};
int weight[]={10,20,30};
int maxvalue=-1;
int prevmax=-1;
int w=50;
double ratio[][]=new double[value.length][2];
for(int i=0;i<value.length;i++){
    ratio[i][0]=1;
    ratio[i][1]=value[i]/(double)weight[i];
    
}
Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
int max=0;
for(int i=ratio.length-1;i>=0;i--)
{int idx=(int)ratio[i][0];
if(w>=weight[idx]){
max+=value[idx];
w+=-weight[idx];
}
else{
max+=(ratio[i][1]*w);
w=0;
break;


}


}

System.out.println(max );

}


}