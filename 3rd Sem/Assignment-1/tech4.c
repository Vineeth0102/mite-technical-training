/* 

Program to convert the amount into denominations. The denominations are 2000, 5600, 200, 100, 50, 20, 10, 5, 1
	example
		input:
			1250
		ouput:
			500 x 2
			200 x 1
			 50 x 1

*/

#include <stdio.h>
void main()
{
    int amt, rem = 0;
    scanf("%d", &amt);
    if (amt >= 2000)
    {
        rem = amt / 2000;
        amt = amt - rem * 2000;
        if (rem > 0)
            printf("2000 x %d \n", rem);
    }
    if (amt >= 500)
    {
        rem = amt / 500;
        amt = amt - rem * 500;
        if (rem > 0)
            printf("500 x %d \n", rem);
    }
    if (amt >= 200)
    {
        rem = amt / 200;
        amt = amt - rem * 200;
        if (rem > 0)
            printf("200 x %d \n", rem);
    }
    if (amt >= 100)
    {
        rem = amt / 100;
        amt = amt - rem * 100;
        if (rem > 0)
            printf("100 x %d \n", rem);
    }
    if (amt >= 50)
    {
        rem = amt / 50;
        amt = amt - rem * 50;
        if (rem > 0)
            printf("50 x %d \n", rem);
    }
    if (amt >= 20)
    {
        rem = amt / 20;
        amt = amt - rem * 20;
        if (rem > 0)
            printf("20 x %d \n", rem);
    }
    if (amt >= 10)
    {
        rem = amt / 10;
        amt = amt - rem * 10;
        if (rem > 0)
            printf("10 x %d \n", rem);
    }
    if (amt > 5)
    {
        rem = amt / 5;
        amt = amt - rem * 5;
        if (rem > 0)
            printf("5 x %d \n", rem);
    }
    if (amt >= 1)
    {
        rem = amt / 1;
        amt = amt - rem * 1;
        if (rem > 0)
            printf("1 x %d \n", rem);
    }
}
