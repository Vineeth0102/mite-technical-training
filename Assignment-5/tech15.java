/*
 
We use the integers a, b, and n  to create the following series:
(a+2^0 *b),(a+2^0 *b+2^1*b) , (a+2^0 *b+2^1*b +2^2*b), …… (a+2^0 *b+2^1*b+2^2*b+....+2^n-1  * b)  
You are given  a, b, and n . For given a, b, and n print the series of numbers.

Constraint:

0<=a,b<=50
0<=n<=15

Output Format:
print the corresponding series on a new line.

Sample Input
5 3 5
Sample Output
8 14 26 50 98

 */

import java.util.*;

public class tech15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        for (int j = 0; j < n; j++) {
            int val = 0;
            for (int k = 0; k <= j; k++) {
                val += Math.pow(2, k) * b;
            }
            System.out.print((a + val) + " ");
        }
        sc.close();
    }
}