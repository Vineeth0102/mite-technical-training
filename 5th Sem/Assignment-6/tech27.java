/*
 
You are given an integer array nums. You should move each element of nums into one of the two arrays A and B
such that A and B are non-empty, and average(A) == average(B).
Return true if it is possible to achieve that and false otherwise.
Note that for an array arr, average(arr) is the sum of all the elements of arr over the length of arr.

Example 1:
Input: nums = [1,2,3,4,5,6,7,8]
Output: true
Explanation: We can split the array into [1,4,5,8] and [2,3,6,7], and both of them have an average of 4.5.

Example 2:
Input: nums = [3,1]
Output: false

*/

import java.util.*;

public class tech27 {

    public static boolean splitArraySameAverage(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        return canPartition(nums, 0, 0, 0, totalSum, 0);
    }

    private static boolean canPartition(int[] nums, int index, int sumA, int sumB, int totalSum, int countA) {
        if (index == nums.length) {
            if (sumA != 0 && sumB != 0 && (double) sumA / countA == (double) sumB / (nums.length - countA)) {
                return true;
            }
            return false;
        }
        if (canPartition(nums, index + 1, sumA + nums[index], sumB, totalSum, countA + 1)) {
            return true;
        }
        if (canPartition(nums, index + 1, sumA, sumB + nums[index], totalSum, countA)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Is it possible to split array into two with same average? " + splitArraySameAverage(arr));
        sc.close();
    }
}
