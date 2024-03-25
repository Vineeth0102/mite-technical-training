/*
Write a program in C to make such a pattern like a pyramid with numbers increased by 1.

Input
4

Output
   1
  2 3
 4 5 6
7 8 9 10
*/

#include <stdio.h>
void main()
{
    int i, k = 1, j, n;
    scanf("%d", &n);
    for (i = 1; i <= n; i++)
    {
        for (j = n; j > i; j--)
        {
            printf(" ");
        }
        for (j = 1; j <= i; j++)
        {
            printf("%d ", k);
            k++;
        }
        printf("\n");
    }
}
