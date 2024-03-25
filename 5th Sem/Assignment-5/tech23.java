/*
 
Given positive integer X. Check if X is a fibonacci term or not. If it is a fibonacci term then check if it is a Prime number or not. If it is a Prime number too, then print X as result. Else print Nearest Fibonacci Prime number of given X. 
FibPrime(29) → 13
FibPrime(79)  → 89
FebPrime(13)  → 13

*/

import java.util.*;

public class tech23 {

    public static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return s * s == x;
    }

    public static boolean isFibonacci(int n) {
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public static int nearestFibPrime(int x) {
        int smaller = x - 1;
        int larger = x + 1;

        while (true) {
            if (isFibonacci(smaller) && isPrime(smaller)) {
                return smaller;
            } else if (isFibonacci(larger) && isPrime(larger)) {
                return larger;
            }
            smaller--;
            larger++;
        }
    }

    public static void fibPrime(int x) {
        if (isFibonacci(x)) {
            if (isPrime(x)) {
                System.out.println(x);
            } else {
                int nearest = nearestFibPrime(x);
                System.out.println(nearest);
            }
        } else {
            int nearest = nearestFibPrime(x);
            System.out.println(nearest);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Nearest FibPrime is :");
        fibPrime(num);
        sc.close();
    }
}
