/*
Write a program in C to read N numbers from keyboard and find their sum and average.
Sample Input
3
10
20
30

Sample Output
Sum : 60
Average : 20
*/

#include <stdio.h>
void main()
{
    double a[50], sum = 0, avg = 0;
    int n, i;
    scanf("%d", &n);
    if (n >= 1)
    {
        for (i = 1; i <= n; i++)
            scanf("%lf", &a[i]);
    }
    for (i = 1; i <= n; i++)
    {
        sum = sum + a[i];
    }
    if (n > 0)
    {
        avg = sum / n;
    }
    printf("Sum : %g\n", sum);
    printf("Average : %g", avg);
}
