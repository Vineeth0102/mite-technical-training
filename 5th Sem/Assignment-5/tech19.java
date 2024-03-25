/*
Given positive integer X. print the nearest prime number to the given X.

NearesPrime(11) → 11
NearestPrime(25) → 23
NearestPrime(21)  → 19 23
NearestPrime(6)  → 5    7

 */

import java.util.*;

public class tech19 {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> nearestPrimes(int x) {
        ArrayList<Integer> primes = new ArrayList<>();
        if (isPrime(x)) {
            primes.add(x);
        } else {
            int lower = x - 1;
            int upper = x + 1;
            while (true) {
                if (isPrime(lower)) {
                    primes.add(lower);
                    break;
                }
                lower--;
            }
            while (true) {
                if (isPrime(upper)) {
                    primes.add(upper);
                    break;
                }
                upper++;
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Nearest Prime of the number is : " + nearestPrimes(num));
        sc.close();
    }
}
