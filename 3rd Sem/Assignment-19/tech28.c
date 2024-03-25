/*
Write a program in C to print all unique elements in an array.
Test Data :
Print all unique elements of an array:
------------------------------------------
Input the number of elements to be stored in the array: 4
Input 4 elements in the array :
element - 0 : 3
element - 1 : 2
element - 2 : 2
element - 3 : 5
Expected Output :
The unique elements found in the array are:
3 5

*/

#include <stdio.h>
void main()
{
    int a[50], n, i, j, flag = 0;
    printf("Input the number of elements to be stored in the array :");
    scanf("%d", &n);
    if (n > 0)
    {
        printf("Input %d elements in the array :\n", n);
        for (i = 0; i < n; i++)
        {
            printf("element - %d : ", i);
            scanf("%d", &a[i]);
        }
        printf("The unique elements found in the array are:");
        for (i = 0; i < n; i++)
        {
            flag = 0;
            for (j = 0; j < n; j++)
            {
                if (a[i] == a[j])
                    flag++;
            }
            if (flag == 1)
            {
                printf("%d ", a[i]);
            }
        }
    }
}
