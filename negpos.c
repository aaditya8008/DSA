#include <stdio.h>
#include <stdlib.h>
struct node{
    int data;
    struct node *next;
    
}*n,*head,*prev,*curr,*neg,*pos,*p,*q,*extra;


struct node * create(struct node*n,int i){
    n=(struct node*)malloc(sizeof(struct node));
    scanf("%d",&n->data);
    if(i==0){
        head=n;
        prev=n;
        i++;
    }
    prev->next=n;
    n->next=NULL;
    prev=n;
    return head;
}
struct node * createto(struct node*n,int i,struct node *q){
    
    n=(struct node*)malloc(sizeof(struct node));
    n->data=q->data;
    if(i==0){
        extra=n;
        prev=n;
        i++;
    }
    prev->next=n;
    n->next=NULL;
    prev=n;
    return extra;
}
struct node * createt(struct node*n,int i,struct node *q){
    
    n=(struct node*)malloc(sizeof(struct node));
    n->data=q->data;
    if(i==0){
        extra=n;
        prev=n;
        i++;
    }
    prev->next=n;
    n->next=NULL;
    prev=n;
    return extra;
}


int main()
{int k;
printf("Enter size: \n");
scanf("%d",&k);
    printf("Enter elements of list 1: \n");
for(int i=0;i<k;i++)
create(n,i);
q=head;
p=head;
int i=0;
while(q!=NULL){
    if((q->data)>0)
    createto(n,i,q); 
    q=q->next;
    
    i++;
}pos=extra;
i=0;
printf("Positive elements : \n");
while(pos!=NULL){
    printf("%d\n",pos->data);
    pos=pos->next;
}

while(p!=NULL){
    if((p->data)<0)
    createt(n,i,p); 
    p=p->next;
    
    i++;
}neg=extra;


printf("Negative elements : \n");
while(neg!=NULL){
    printf("%d\n",neg->data);
    neg=neg->next;
}
    return 0;
}
