/* 

Given two int values, return their sum. Unless the two values are the same, then return double their sum.
 
sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8

*/

import java.util.*;

public class tech7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 != num2 ){
            System.out.println(num1+num2);
        }
        else{
            System.out.println((num1+num2)*2);
        }
        sc.close();
    }
}