/*

Write a C program to read roll no, name and marks of three subjects and calculate the total, percentage and division.

Test Data :
Input the Roll Number of the student :784
Input the Name of the Student :James
Input the marks of Physics, Chemistry and Computer Application : 70 80 90
Expected Output :
Roll No : 784
Name of Student : James
Marks in Physics : 70
Marks in Chemistry : 80
Marks in Computer Application : 90
Total Marks = 240
Percentage = 80.00
Division = First

*/

#include <stdio.h>
void main()
{
    int rollno, chem, phy, ca, total = 0;
    char name[15];
    double percent;
    printf("Input the Roll Number of the student : ");
    scanf("%d", &rollno);
    printf("Input the Name of the Student :");
    scanf("%s", name);
    printf("Input the marks of Physics, Chemistry and Computer Application : ");
    scanf("%d%d%d", &phy, &chem, &ca);
    if (phy >= 0 && phy <= 100 && chem >= 0 && chem <= 100 && ca >= 0 && ca <= 100)
    {
        printf("Roll No : %d\n", rollno);
        printf("Name of Student : %s\n", name);
        printf("Marks in Physics : %d\n", phy);
        printf("Marks in Chemistry : %d\n", chem);
        printf("Marks in Computer Application : %d\n", ca);
        total = phy + chem + ca;
        printf("Total Marks = %d\n", total);
        percent = (total / 300.0) * 100;
        printf("Percentage = %.2lf\n", percent);
        if (percent >= 85)
            printf("Division = Distiction");
        else if (percent >= 70)
            printf("Division = First");
        else if (percent >= 55)
            printf("Division = Second");
        else if (percent >= 35)
            printf("Division = Pass");
        else
            printf("Division = Fail");
    }
}
