/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, print [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
 
Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:
Input: nums = [], target = 0
Output: [-1,-1]

 
Constraints:
0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
*/

#include<stdio.h>
void main(){
    int a[50],n,i,target,beg=-1,end=-1;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("target : ");
    scanf("%d",&target);
    for ( i = 0; i < n; i++){
        if(target==a[i]){
            beg=i;
            while(target==a[i]){
                end=i;
                i++;
            }
        }
        break;
    }
    printf("[%d,%d]",beg,end);
}
