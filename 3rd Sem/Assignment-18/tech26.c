/*
Question = "https://docs.google.com/document/d/1Nw6kdLuvcABW4aQJYUFchYftzoolAxCdrJ-oKtup7tY/edit"
*/

#include <stdio.h>
void main()
{
    int a[10], b[10], test, n1, n2, i;
    int sum1 = 0, sum2 = 0, sum, rem = 0, rev = 0;
    scanf("%d", &test);
    while (test > 0)
    {
        scanf("%d %d", &n1, &n2);
        for (i = 0; i < n1; i++)
        {
            scanf("%d", &a[i]);
            sum1 = sum1 * 10 + a[i];
        }
        for (i = 0; i < n2; i++)
        {
            scanf("%d", &b[i]);
            sum2 = sum2 * 10 + b[i];
        }
        sum = sum1 + sum2;
        sum1 = 0;
        sum2 = 0;
        while (sum != 0)
        {
            rem = sum % 10;
            rev = rev * 10 + rem;
            sum = sum / 10;
        }
        while (rev != 0)
        {
            rem = rev % 10;
            printf("%d ", rem);
            rev = rev / 10;
        }
        printf("\n");
        test--;
    }
}
