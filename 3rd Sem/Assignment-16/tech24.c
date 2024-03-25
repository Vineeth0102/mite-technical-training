/*
Question = "https://docs.google.com/document/d/1fUqJyUFSSG0j-1pk5E0cB3ftrreIm7CThT4gQj7jsO4/edit"
*/

#include <stdio.h>
void main()
{
    int a[50], n, i, temp, mid, test;
    scanf("%d", &n);
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    test = n;
    mid = n / 2;
    for (i = 0; i < mid; i++)
    {
        temp = a[i];
        a[i] = a[n - 1];
        a[n - 1] = temp;
        n--;
    }
    for (i = 0; i < test; i++)
    {
        printf("%d ", a[i]);
    }
}
