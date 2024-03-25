/*

Write a C program to find the eligibility of admission for a professional course based on the following criteria:

Eligibility Criteria :
Marks in Maths >=65 and Marks in Phy >=55 and Marks in Chem>=50
and Total in all three subject >=190 or
Total in Maths and Physics >=140

Input :
Physics :65
Chemistry :51
Mathematics :72

Output:
The candidate is not eligible for admission.

*/

#include <stdio.h>
void main()
{
    int phy, chem, math, total;
    printf("Physics : ");
    scanf("%d", &phy);
    printf("Chemistry : ");
    scanf("%d", &chem);
    printf("Mathematics : ");
    scanf("%d", &math);
    total = phy + chem + math;
    if ((math >= 65 && chem >= 50 && phy >= 55) && (total >= 190 || math + phy >= 140))
        printf("The candidate is eligible for admission");
    else
        printf("The candidate is not eligible for admission");
}
