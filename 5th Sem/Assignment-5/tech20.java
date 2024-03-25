/*
 
Given positive integer X. Find the sum of prime digits of X is a Prime or not. Return true if it is a prime number. Else return false.

PrimeDigitSum(1234)  —> true [ 2+3 = 5]
PrimeDigitSum(5677)  → true [2+7+7 = 19]
PrimeDigitSum(987) —> true [7 = 7]
PrimeDigitSum(3456)  → false [3+5 = 8 is not a prime]

*/

import java.util.*;

public class tech20 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isPrimeDigitSumPrime(int x) {
        int sum = 0;
        while (x != 0) {
            int digit = x % 10;
            if (isPrime(digit)) {
                sum += digit;
            }
            x /= 10;
        }
        return isPrime(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(isPrimeDigitSumPrime(num));
        sc.close();
    }
}
