/*

Shobi owns a garment factory. She gives special offers to her customers for all occasions.  She wants to give special discounts to her esteemed customers for this Christmas and New Year. The discount ranges from 0% to 40%, it depends upon the customer’s bill amount. She categorizes the discount details as follows:

< 5000 ===> No discount
5000 to 10000 ===> 10%
10001 to 50000 ===> 20%
50001 to 100000 ===> 30 %
> 100000 ===> 40%.

And she is not good at Mathematics. You are a Software Engineer and she contacts you for support. Kindly help her to develop to calculate the bill amount and print the bill in the following format

Bill Amount :  XXXXXXX.XX
Discount (-) :         XXXX.XX
                   *******************
                       XXXXXXX.XX
	       *******************

*/

#include<stdio.h>
void main()
{
    float amount,final_amount,dis_amount;
    printf("Bill amount  : ");
    scanf("%f",&amount);
    if(amount<5000)
    dis_amount=0;
    if(amount>=5000&&amount<=10000)
    dis_amount=0.1*amount;
    if(amount>=10001&&amount<=50000)
    dis_amount=0.2*amount;
    if(amount>=50001&&amount<=100000)
    dis_amount=0.3*amount;
    if(amount>100000)
    dis_amount=0.4*amount;
    final_amount=amount-dis_amount;
    printf("Discount(-)  : %.2f",dis_amount);
    printf("\n**************************\n");
    printf("Final amount : %.2f",final_amount);
    printf("\n**************************\n");
}

