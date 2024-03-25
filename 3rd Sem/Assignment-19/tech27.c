/*
Write a program in C to count a total number of duplicate elements in an array. 
Test Data :
Input the number of elements to be stored in the array :3
Input 3 elements in the array :
element - 0 : 5
element - 1 : 1
element - 2 : 1
Expected Output :
Total number of duplicate elements found in the array is : 1
*/

#include<stdio.h>
void main(){
    int a[50],n,i,j,flag=0;
    printf("Input the number of elements to be stored in the array :");
    scanf("%d",&n);
    if(n>0)
    {
        printf("Input %d elements in the array :\n",n);
        for(i=0;i<n;i++)
        {
            printf("element - %d : ",i);
            scanf("%d",&a[i]);
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    flag++;
                    break;
                }
            }
            if(flag>0)
            {
                printf("Total number of duplicate elements found in the array is : %d\n",flag);
            }
       }
    }
}
