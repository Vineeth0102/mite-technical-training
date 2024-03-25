// programme to print the words from the given digit
#include <stdio.h>
void main()
{
    int n, rem, sum;
    scanf("%d", &n);
    while (n != 0)
    {
        rem = n % 10;
        sum = sum * 10 + rem;
        n = n / 10;
    }
    while (sum != 0)
    {
        int rem = 0;
        rem = sum % 10;
        sum = sum / 10;
        switch (rem)
        {
        case 0:
            printf("ZERO ");
            break;
        case 1:
            printf("ONE ");
            break;
        case 2:
            printf("TWO ");
            break;
        case 3:
            printf("THREE ");
            break;
        case 4:
            printf("FOUR ");
            break;
        case 5:
            printf("FIVE ");
            break;
        case 6:
            printf("SIX ");
            break;
        case 7:
            printf("SEVEN ");
            break;
        case 8:
            printf("EIGHT ");
            break;
        case 9:
            printf("NINE ");
            break;
        default:
            printf("iNVALID INPUT ");
            break;
        }
    }
}
