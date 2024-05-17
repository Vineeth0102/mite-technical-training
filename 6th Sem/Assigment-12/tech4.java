
/*

Write a Java program to print prime elements whose reverse is also a prime number from the given array of
elements.

Input [1,2,3,4,5] 
Output 2,3,5

Input [4,11,13,23]
Output 11,13

Input [9,6,4]
Output 0

 */
import java.util.Scanner;

public class tech4 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (isPrime(arr[i]) && isPrime(reversed(arr[i]))) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println(count);
        }
        sc.close();
    }

    public static boolean isPrime(int val) {
        for (int i = 2; i <= Math.sqrt(val); i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reversed(int val) {
        int sum = 0;
        while (val != 0) {
            sum = sum * 10 + val % 10;
            val = val / 10;
        }
        return sum;
    }
}
