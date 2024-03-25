/*
 
Given two sorted arrays arr1 and arr2 of size N and M respectively and an element K. The task is to find the element that would be at the kth position of the final sorted array.
 
Example 1:

Input:
arr1[] = {2, 3, 6, 7, 9}
arr2[] = {1, 4, 8, 10}
k = 5
Output:
6
Explanation:
The final sorted array would be -
1, 2, 3, 4, 6, 7, 8, 9, 10
The 5th element of this array is 6.
Example 2:
Input:
arr1[] = {100, 112, 256, 349, 770}
arr2[] = {72, 86, 113, 119, 265, 445, 892}
k = 7
Output:
256
Explanation:
Final sorted array is - 72, 86, 100, 112,
113, 119, 256, 265, 349, 445, 770, 892
7th element of this array is 256.

Your Task:  
You don't need to read input or print anything. Your task is to complete the function kthElement() which takes the arrays arr1[], arr2[], its size N and M respectively and an integer K as inputs and returns the element at the Kth position.

Expected Time Complexity: O(Log(N) + Log(M))
Expected Auxiliary Space: O(Log (N))

Constraints:
1 <= N, M <= 106
0 <= arr1i, arr2i < INT_MAX
1 <= K <= N+M

*/

import java.util.Scanner;

class Solution {
    public int kthElement(int[] arr1, int[] arr2, int n, int m, int k) {
        if (n > m) {
            return kthElement(arr2, arr1, m, n, k);
        }
        if (n == 0) {
            return arr2[k - 1];
        }
        if (k >= n + m) {
            return -1; 
        }
        
        int low = Math.max(0, k - m);
        int high = Math.min(k, n);
        
        while (low < high) {
            int mid1 = low + (high - low) / 2;
            int mid2 = k - mid1;
            
            if (arr1[mid1] < arr2[mid2 - 1]) {
                low = mid1 + 1;
            } else {
                high = mid1;
            }
        }
        
        int element1 = low > 0 ? arr1[low - 1] : Integer.MIN_VALUE;
        int element2 = low < k ? arr2[k - low - 1] : Integer.MIN_VALUE;
        
        return Math.max(element1, element2);
    }
}

public class tech36 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int num1 = sc.nextInt();
        int arr1[] = new int[num1];
        System.out.print("Enter the elements of the array : ");
        for(int i = 0 ; i< num1;i++ ){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the array : ");
        int num2 = sc.nextInt();
        int arr2[] = new int[num2];
        System.out.print("Enter the elements of the array : ");
        for(int i = 0 ; i< num2;i++ ){
            arr2[i] = sc.nextInt();
        }
        System.out.print("Enter the index  : ");
        int index = sc.nextInt();
        System.out.println("Element at the " + index + "th position: " + solution.kthElement(arr1, arr2, num1, num1, index));
        sc.close();
    }
}
