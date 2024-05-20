/*

Write a Java program to print the largest prime number formed by the sum of any two elements of the array.
Input : [1,2,3,4,5] 
Output : 7 

Input : [4,5,6] 
Output  : 11 

Input : [9,1,2,4]
Output : 13

 */

import java.util.*;

public class tech1 {
    public static void main(String[] args) {
        int ref = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int j = size - 1, i = 0;
        while (i < j) {
            if (isPrime(arr[i] + arr[j])) {
                if (ref < arr[i] + arr[j]) {
                    ref = arr[i] + arr[j];
                }
                i++;
                j = size - 1;
            } else {
                j--;
            }
        }
        System.out.println(ref);
        sc.close();
    }

    public static boolean isPrime(int sum) {
        for (int i = 2; i <= Math.sqrt(sum); i++) {
            if (sum % i == 0) {
                return false;
            }
        }
        return true;
    }

}