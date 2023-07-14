
import java.lang.String;
import java.util.*;

public class chocolaproblem{
public static void main(String args[]){
Integer h[]={4,1,2};
Integer v[]={2,1,3,1,4};
 Arrays.sort(h , Collections.reverseOrder());
 Arrays.sort(v ,Collections.reverseOrder());
int vcount=1;
int hcount=1;
int i=0;
int j=0; 
int cost=0;
while(i<v.length&&j<h.length){
if(v[i]>h[j]){
cost=cost+hcount*v[i];
vcount++;
i++;

}
else{
    cost=cost+vcount*h[j];
hcount++;
j++;
}


}
while(i<v.length){
cost=cost+hcount*v[i];
vcount++;
i++;

}

while(j<h.length){
cost=cost+vcount*h[j];
hcount++;
j++;
}

System.out.println("Total min cost : "+cost);


}



}