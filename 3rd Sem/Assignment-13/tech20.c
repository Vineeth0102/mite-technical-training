/*
question = "https://docs.google.com/document/d/1VCLOd4H_tmsDHJbwE_g6b9q3yXNwbAykO5idRYJDJ5U/edit"
*/

#include <stdio.h>
void main()
{
    int sum = 0, num, rem = 0, a[50], n, i;
    scanf("%d", &n);
    for (i = 1; i <= n; i++)
    {
        scanf("%d", &a[i]);
    }
    for (i = 1; i <= n; i++)
    {
        num = a[i];
        while (num % 10 == 0)
        {
            num = num / 10;
        }
        sum = 0;
        while (num != 0)
        {
            rem = num % 10;
            sum = rem + sum * 10;
            num = num / 10;
        }
        printf("%d\n", sum);
    }
}
