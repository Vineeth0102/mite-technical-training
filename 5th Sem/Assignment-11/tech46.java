/*

The union of two arrays can be defined as the common and distinct elements in the two arrays.
Given two sorted arrays of size n and m respectively, find their union.

Example 1:

Input: 
n = 5, arr1[] = {1, 2, 3, 4, 5}  
m = 3, arr2 [] = {1, 2, 3, 6, 7}
Output: 
1 2 3 4 5 6 7
Explanation: 
Distinct elements including both the arrays are: 1 2 3 4 5 6 7.

Example 2:
Input: 
n = 5, arr1[] = {2, 2, 3, 4, 5}  
m = 5, arr2[] = {1, 1, 2, 3, 4}
Output: 
1 2 3 4 5
Explanation: 
Distinct elements including both the arrays are: 1 2 3 4 5.
Example 3:

Input:
n = 5, arr1[] = {1, 1, 1, 1, 1}
m = 5, arr2[] = {2, 2, 2, 2, 2}
Output: 
1 2
Explanation: 
Distinct elements including both the arrays are: 1 2.

Your Task: 
You do not need to read input or print anything. Complete the function findUnion() that takes two arrays arr1[], arr2[], and their size n and m as input parameters and returns a list containing the union of the two arrays.

Expected Time Complexity: O(n+m).
Expected Auxiliary Space: O(n+m).

Constraints:
1 <= n, m <= 105
-109 <= arr1[i], arr2[i] <= 109

*/

import java.util.*;

public class tech46 {
    public static List<Integer> findUnion(int[] arr1, int[] arr2) {
        int n = arr1.length,m = arr2.length;
        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (i == 0 || arr1[i] != arr1[i - 1]) {
                    union.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (j == 0 || arr2[j] != arr2[j - 1]) {
                    union.add(arr2[j]);
                }
                j++;
            } else {
                if ((i == 0 || arr1[i] != arr1[i - 1]) && (j == 0 || arr2[j] != arr2[j - 1])) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while (i < n) {
            if (i == 0 || arr1[i] != arr1[i - 1]) {
                union.add(arr1[i]);
            }
            i++;
        }
        while (j < m) {
            if (j == 0 || arr2[j] != arr2[j - 1]) {
                union.add(arr2[j]);
            }
            j++;
        }
        return union;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the first array : ");
        int size = sc.nextInt();
        int arr1[] = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter number of elements in the Second array : ");
        size = sc.nextInt();
        int arr2[] = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(findUnion(arr1, arr2));
        sc.close();
    }
}
