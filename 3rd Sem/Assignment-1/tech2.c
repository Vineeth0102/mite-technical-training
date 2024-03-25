// progarmme to check weather the given date is valid or not
#include <stdio.h>
void main()
{
    int year, date, month;
    printf("Enter the date month and year : ");
    scanf("%d %d %d ", &date, &month, &year);
    if (date < 1 || date > 31 || month < 1 || month > 12 || year < 1)
    {
        printf("Invalid");
        exit(0);
    }
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
    {
        if (date <= 31)
            printf("valid");
    }
    else if (month == 2)
    {
        if (date <= 28)
            printf("valid");
        else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        {
            if (date <= 29)
                printf("valid");
        }
        else
        {
            printf("Invalid");
        }
    }
    else
    {
        if (date <= 30)
            printf("valid");
        else
        {
            printf("Invalid");
        }
    }
}
