/*

Given two positive integers X and Y that indicate a range of numbers. Print the number from the same range which is a fibonacci term and  a prime too. If not print 0.

FibPrime(2,25) → 2 3 5 13
FibPrime(1,100) → 2 3 5 13 89
FibPrime(25, 75) → 0

 */
import java.util.*;

public class tech22 {

    public static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return s * s == x;
    }

    public static boolean isFibonacci(int n) {
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void findFibPrimeInRange(int x, int y) {
        boolean found = false;
        for (int i = x; i <= y; i++) {
            if (isFibonacci(i) && isPrime(i)) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("0");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the end number : ");
        int num2 = sc.nextInt();
        System.out.print("Sequence of the given range is : ");
        findFibPrimeInRange(num1, num2);
        sc.close();
    }
}

