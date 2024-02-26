/*

Given a sorted array arr containing n elements with possibly some duplicate, the task is to find the first and last occurrences of an element x in the given array.
Note: If the number x is not found in the array then return both the indices as -1.

Example 1:

Input:
n=9, x=5
arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
Output:  
2 5
Explanation: 
First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5. 
Example 2:

Input:
n=9, x=7
arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
Output:  
6 6
Explanation: 
First and last occurrence of 7 is at index 6.
Your Task:
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function find() that takes array arr, integer n and integer x as parameters and returns the required answer.

Expected Time Complexity: O(logN)
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N ≤ 106
1 ≤ arr[i],x ≤ 109

*/

import java.util.Scanner;

class Solution {
    public int[] find(int[] arr, int n, int x) {
        int[] result = new int[]{-1, -1}; 
        result[0] = findFirstOccurrence(arr, n, x);
        result[1] = findLastOccurrence(arr, n, x);    
        return result;
    }
    
    private int findFirstOccurrence(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int firstOccurrence = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == x) {
                firstOccurrence = mid;
                high = mid - 1;  
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return firstOccurrence;
    }
    
    private int findLastOccurrence(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int lastOccurrence = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == x) {
                lastOccurrence = mid;
                low = mid + 1; 
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return lastOccurrence;
    }
}

public class tech34 {
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
        System.out.print("Enter the element to find occarence : ");
        int ele = sc.nextInt();

        int[] res = solution.find(arr, num, ele);
        System.out.println("First occurrence of " + ele + " is at index " + res[0] + " and last occurrence is at index " + res[1]);
        
        sc.close();
    }
}
