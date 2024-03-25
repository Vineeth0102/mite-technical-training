/*

Write a program to calculate the Electricity Bill for the following tariff details.

img = "https://docs.google.com/document/d/1FFD0gG0eX6gGIHz1oxTkxBQuuunm-wTPOwFuvfWu210/edit"

*/

#include <stdio.h>
void main()
{
    int units;
    float cost, final_cost;
    printf("Units consumed : ");
    scanf("%d", &units);
    if (units <= 100)
    {
        cost = units * 2.5 + 30;
        final_cost = units * 0 + 0;
    }
    else if (units > 100 && units <= 200)
    {
        cost = units * 2.5 + 30;
        final_cost = 100 * 0 + (units - 100) * 1.5 + 20;
    }
    else if (units > 200 && units <= 500)
    {
        cost = 200 * 2.5 + (units - 200) * 3 + 40;
        final_cost = 100 * 0 + 100 * 2 + (units - 200) * 3 + 30;
    }
    else if (units > 500)
    {
        cost = 100 * 2.5 + 100 * 3.5 + 300 * 4.6 + (units - 500) * 6.6 + 50;
        final_cost = 100 * 0 + 100 * 3.5 + 300 * 4.6 + (units - 500) * 6.6 + 50;
    }
    else
    {
        printf("Invalid units input");
    }
    printf("Amount :%.2f\n", cost);
    printf("Final amount after subsidy :%.2f", final_cost);
}
