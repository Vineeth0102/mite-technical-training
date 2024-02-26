/*

Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.
Note: Modify the original array itself. Do it without using any extra space. You do not have to return anything.

Example 1:

Input:
n = 6
arr[] = {1,2,3,4,5,6}
Output: 6 1 5 2 4 3
Explanation: Max element = 6, min = 1, 
second max = 5, second min = 2, and 
so on... Modified array is : 6 1 5 2 4 3.
Example 2:


Input:
n = 11
arr[]={10,20,30,40,50,60,70,80,90,100,110}
Output:110 10 100 20 90 30 80 40 70 50 60
Explanation: Max element = 110, min = 10, 
second max = 100, second min = 20, and 
so on... Modified array is : 
110 10 100 20 90 30 80 40 70 50 60.
Your Task:
The task is to complete the function rearrange() which rearranges elements as explained above. Printing of the modified array will be handled by driver code.


Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).


Constraints:
1 <= n <= 10^6
1 <= arr[i] <= 10^7

*/

import java.util.Scanner;

class Solution {
    public void rearrange(int[] arr, int n) {
        int max_index = n - 1; 
        int min_index = 0; 
        int max_element = arr[max_index] + 1; 
        
      
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[max_index] % max_element) * max_element;
                max_index--;
            } 
            else {
                arr[i] += (arr[min_index] % max_element) * max_element;
                min_index++;
            }
        }
        
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / max_element;
        }
    }
}

public class tech35 {
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
        solution.rearrange(arr, num);
        System.out.println("Modified array: ");
        System.out.println("Modified array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
