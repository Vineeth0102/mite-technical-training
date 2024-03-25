/*
 
Given integer x. Write a code to print its reverse.

ReverseOfx(123) → 321
ReverseOfx(-123) → -321
ReverseOfx(406) → 604.

 */

import java.util.*;

public class tech16 {
    public static void main(String[] args) {
        int rem, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be reversed : ");
        int num = sc.nextInt();
        while (num != 0) {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        System.out.println("The rev number is : " + sum);
        sc.close();
    }
}