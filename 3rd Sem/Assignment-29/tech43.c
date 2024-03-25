/*
Question = "https://docs.google.com/document/d/1KdjEianSSKSZPHoYIq8kscGZjVA-xuR3FL-6agOV66Q/edit"
*/

#include<stdio.h>
void main(){
    int n,a[50],i,j,temp,k=0;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
            if(a[i]>a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                k++;
            }
        }
    }
    printf("Array is sorted in %d swaps\n",k);
    printf("First element %d\n",a[0]);
    printf("Last element %d\n",a[n-1]);
}

