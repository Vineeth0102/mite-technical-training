/*
 you are given a number, and you have to extract the key by finding the difference between the sum of the even and odd numbers of the input.
Test Case :
Input : 24319587
Output :  11
Explanation : odd terms : 3 + 1 + 9 + 5 + 7 = 25
                              even terms : 2 + 4 + 8 = 14
                              output : 11 (25-14)
*/

#include<stdio.h>
#include<math.h>
void main()
{
    int num,even_sum=0,rem,odd_sum=0,sub;
    scanf("%d",&num);
    while(num!=0)
    {
        rem=num%10;
        if(rem%2==0)
        {
            even_sum=rem+even_sum;
        }
        else
        {
            odd_sum=rem+odd_sum;
        }
        num=num/10;
    }  
    sub=fabs(odd_sum-even_sum);
    printf("%d",sub); 
}

