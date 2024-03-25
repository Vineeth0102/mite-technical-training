/*
Question = "https://docs.google.com/document/d/1uSNIa3IDunR2pVnPNS5bRQ_iyS_CKtHcUVm9yUkdQnA/edit"
*/

#include <stdio.h>
void main()
{
    int n, i, j, k = 0, temp;
    scanf("%d", &n);
    for (i = 1; i <= n; i++)
    {
        for (j = 1; j <= i; j++)
        {
            k++;
            if (i == j)
            {
                printf("%d", k);
            }
            else
            {
                printf("%d*", k);
            }
        }
        printf("\n");
    }
    for (i = n; i >= 0; i--)
    {
        k = k - n;
        n--;
        temp = k;
        for (j = i; j >= 1; j--)
        {
            if (i == j)
            {
                printf("%d", temp + 1);
            }
            else
            {
                printf("*%d", temp + 1);
            }
            temp++;
        }
        printf("\n");
    }
}
