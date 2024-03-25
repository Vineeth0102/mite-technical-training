/*
Question = "https://docs.google.com/document/d/158y-TNCUIkmSJb5Yc_hdYn28m5fLcrpb_ovhzTC_PoY/edit"
*/

#include <stdio.h>
#include <stdlib.h>
void main()
{
    int a[10], b[10], n1, n2, i, sum1 = 0, sum2 = 0, sum, rem;
    scanf("%d", &n1);
    for (i = 0; i < n1; i++)
    {
        scanf("%d", &a[i]);
        sum1 = sum1 * 10 + a[i];
    }
    scanf("%d", &n2);
    for (i = 0; i < n2; i++)
    {
        scanf("%d", &b[i]);
        sum2 = sum2 * 10 + b[i];
    }
    sum = sum1 + sum2;
    if (sum == 0)
    {
        printf("0");
        exit(0);
    }
    while (sum != 0)
    {
        rem = sum % 10;
        sum = sum / 10;
        printf("%d ", rem);
    }
}
