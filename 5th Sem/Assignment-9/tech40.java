/*

Given an array of n distinct elements. Find the minimum number of swaps required to sort the array in strictly increasing order.

Example 1:

Input:
nums = {2, 8, 5, 4}
Output:
1
Explanation:
swap 8 with 4.
Example 2:

Input:
nums = {10, 19, 6, 3, 5}
Output:
2
Explanation:
swap 10 with 3 and swap 19 with 5.

Your Task:
You do not need to read input or print anything. Your task is to complete the function minSwaps() which takes the nums as input parameter and returns an integer denoting the minimum number of swaps required to sort the array.
If the array is already sorted, return 0. 

Expected Time Complexity: O(nlogn)
Expected Auxiliary Space: O(n)

Constraints:
1 ≤ n ≤ 105
1 ≤ numsi ≤ 106

*/

import java.util.*;

class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int swaps = 0;
        int[] sortedNums = Arrays.copyOf(nums, n);
        Arrays.sort(sortedNums);
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(nums[i], i);
        }
        for (int i = 0; i < n; i++) {
            if (sortedNums[i] != nums[i]) {
                int correctIndex = indexMap.get(sortedNums[i]);
                swap(nums, i, correctIndex);
                indexMap.put(nums[i], i);
                indexMap.put(nums[correctIndex], correctIndex);
                swaps++;
            }
        }
        
        return swaps;
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

public class tech40 {
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
        System.out.println(solution.minSwaps(arr));
        sc.close();
    }
}
