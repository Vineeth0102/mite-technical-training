/*
Write a program in C to read any Month Number in integer and display the number of days for this month.
Test Data :
7
Expected Output :
Month have 31 days
*/

#include <stdio.h>
void main()
{
    int month;
    scanf("%d", &month);
    if (month > 0 && month < 13)
    {
        if (month == 2)
            printf("Month have 28 or 29 days");
        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            printf("Month have 31 days");
        else
            printf("Month have 30 days");
    }
}
