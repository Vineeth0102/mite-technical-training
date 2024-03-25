/*

Write a C program to check whether a triangle is Equilateral, Isosceles or Scalene.
Test Data :
50 50 60
Expected Output :
This is an isosceles triangle.

*/

#include <stdio.h>
void main()
{
    double s1, s2, s3;
    scanf("%lf %lf %lf", &s1, &s2, &s3);
    if (s1 == s2 && s2 == s3 && s3 == s1)
        printf("This is an equilateral triangle");
    else if (s1 != s2 && s2 != s3 && s3 != s1)
        printf("This is an scalene triangle");
    else
        printf("This is a isosceles triangle");
}
