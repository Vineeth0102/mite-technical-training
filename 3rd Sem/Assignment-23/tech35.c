/*
Given an integer n, return the number of prime numbers that are strictly less than n.

Example 1:
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

Example 2:
Input: n = 0
Output: 0

Example 3:
Input: n = 1
Output: 0
*/

#include <stdio.h>
void main()
{
    int n, i, flag = 0, j, k = 0;
    scanf("%d", &n);
    for (i = 2; i <= n; i++)
    {   
        flag = 0;
        for (j = 1; j <= i; j++)
        {
            if (i % j == 0)
            {
                flag++;
            }
        }
        if (flag == 2)
        {
            k++;
        }
    }
    printf("%d ", k);
}
