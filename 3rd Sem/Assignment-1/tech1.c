//progarmme to check weather the give number is postive or negative or zero
#include<stdio.h>
void main(){
    int n;
    printf("Enter the number to be checked : ");
    scanf("%d",&n);
    if(n<0){
        printf("The given number is negative");
    }
    else if(n==0){
        printf("The number is equale to zero");
    }
    else{
        printf("The number is postive");
    }
}
