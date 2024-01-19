/* 
 
Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.  
 
makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true

*/

import java.util.*;

public class tech8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
            System.out.println((num1 + num2) == 10 || num1 == 10 || num2 == 10 );
        sc.close();
    }
}