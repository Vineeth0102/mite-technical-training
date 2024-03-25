/*
Write a program in C to read any digit, display in the word.
Test Data :
4
Expected Output :
Four
*/

#include <stdio.h>
#include <stdlib.h>
void main()
{
    long int n, sum = 0, rem;
    scanf("%ld", &n);
    while (n > 0)
    {
        rem = n % 10;
        sum = sum * 10 + rem;
        n = n / 10;
    }
    n = sum;
    while (n > 0)
    {
        rem = n % 10;
        switch (rem)
        {
        case 1:
            printf("one ");
            break;
        case 2:
            printf("two ");
            break;
        case 3:
            printf("three ");
            break;
        case 4:
            printf("four ");
            break;
        case 5:
            printf("five ");
            break;
        case 6:
            printf("six ");
            break;
        case 7:
            printf("seven ");
            break;
        case 8:
            printf("eight ");
            break;
        case 9:
            printf("nine ");
            break;
        case 0:
            printf("zero ");
            break;
        default:
            printf("");
            break;
        }
        n = n / 10;
    }
}
