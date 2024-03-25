/*

You are given an integer array nums containing distinct numbers, and you can perform the following operations
until the array is empty:
-->If the first element has the smallest value, remove it
-->Otherwise, put the first element at the end of the array.
Return an integer denoting the number of operations it takes to make nums empty.

Example 1:
Input: nums = [3,4,-1]
Output: 5
Operation Array
1 [4, -1, 3]
2 [-1, 3, 4]
3 [3, 4]
4 [4]
5 []

Example 2:
Input: nums = [1,2,4,3]
Output: 5
Constraints:
-->1 &lt;= nums.length &lt;= 105
-->-109 &lt;= nums[i] &lt;= 109
-->All values in nums are distinct.

 */

import java.util.*;

public class tech25 {

    public static int minOperations(int[] nums) {
        int minIndex = findMinIndex(nums);
        int operations = 0;

        while (true) {
            if (minIndex == 0) {
                nums = removeFirstElement(nums);
                operations++;
            } else {
                nums = moveFirstToEnd(nums);
                operations++;
            }

            if (nums.length == 0) {
                break;
            }

            minIndex = findMinIndex(nums);
        }

        return operations;
    }

    public static int[] removeFirstElement(int[] nums) {
        int[] newArr = new int[nums.length - 1];
        System.arraycopy(nums, 1, newArr, 0, nums.length - 1);
        return newArr;
    }

    public static int[] moveFirstToEnd(int[] nums) {
        int[] newArr = new int[nums.length];
        System.arraycopy(nums, 1, newArr, 0, nums.length - 1);
        newArr[nums.length - 1] = nums[0];
        return newArr;
    }

    public static int findMinIndex(int[] nums) {
        int minIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
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
        System.out.println("Number of operations for nums1: " + minOperations(arr));
        sc.close();
    }
}
