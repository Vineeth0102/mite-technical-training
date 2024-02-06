/*
 
Given positive integer x. Write a program to print a Binary number of x.

BinaryNum(23) → 10111
BinaryNum(124) → 1111100
BinaryNum(234) → 11101010

 */

import java.util.*;

public class tech17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        while (num != 1) {
            if (num % 2 == 0) {
                str = "0" + str;
            } else {
                str = "1" + str;
            }
            num = num / 2;
        }
        str = "1" + str;
        System.out.println(str);
        sc.close();
    }
}
