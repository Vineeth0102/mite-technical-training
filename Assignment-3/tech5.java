/* 

Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
 
lastDigit(7, 17) → true
lastDigit(6, 17) → false   
lastDigit(3, 113) → true

*/

import java.util.*;

public class tech5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a % 10 == b % 10);
        sc.close();
    }
}