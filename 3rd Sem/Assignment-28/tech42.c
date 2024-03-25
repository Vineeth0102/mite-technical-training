/*
Question = "https://docs.google.com/document/d/14h6oPyTEE8OK4CypFQh3k86aIOE4ch3o8dKXKOi2dZo/edit"
*/

#include<stdio.h>
void main(){
    int a[50],n,i,num,temp,j;
    scanf("%d %d",&n,&num);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    for(i=0;i<num;i++){
        temp=a[0];
        for(j=0;j<n;j++){
         a[j]=a[j+1];
        }
        a[n-1]=temp;
    }
     for(i=0;i<n;i++){
        printf("%d ",a[i]);
    }
}

