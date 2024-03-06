/*

Triplet Sum in Array (3sum)

Explanation: Given an array arr[] of size n and an integer X. Find if there’s a triplet in the array which sums up to the given integer X.

Example : 
Input: array = {12, 3, 4, 1, 6, 9}, sum = 24; 
Output: 12, 3, 9 
Explanation: There is a triplet (12, 3 and 9) present 
in the array whose sum is 24. 
Input: array = {1, 2, 3, 4, 5}, sum = 9 
Output: 5, 3, 1 
Max Time Complexity: O(n3)
Max Space Complexity: O(1)

*/

import java.util.*;

class Solution {
    public void findTriplet(int[] arr, int X) {
        int n = arr.length;
        boolean found = false;
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == X) {
                    System.out.println("Triplet found: " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                    found = true;
                    return;
                } else if (sum < X) {
                    left++;
                } else {
                    right--; 
                }
            }
        }
        if (!found) {
            System.out.println("No triplet found with sum " + X);
        }
    }
}

public class tech43 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.print("Enter the elements of the array : ");
        for(int i = 0 ; i< num;i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the sum of the array : ");
        int sum = sc.nextInt();
        solution.findTriplet(arr, sum);
    }
}
