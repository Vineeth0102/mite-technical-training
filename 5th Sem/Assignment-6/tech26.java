/*
 
You are given a 0-indexed 1-dimensional (1D) integer array original, and two integers, m and n. You are tasked with
creating a 2-dimensional (2D) array with  m rows and n columns using all the elements from original.
The elements from indices 0 to n - 1 (inclusive) of original should form the first row of the constructed 2D array, the
elements from indices n to 2 * n - 1 (inclusive) should form the second row of the constructed 2D array, and so on.
Return an m x n 2D array constructed according to the above procedure, or an empty 2D array if it is impossible.
 
Example 1:

Input: original = [1,2,3,4], m = 2, n = 2
Output: [[1,2],[3,4]]
Explanation: The constructed 2D array should contain 2 rows and 2 columns.
The first group of n=2 elements in original, [1,2], becomes the first row in the constructed 2D array.
The second group of n=2 elements in original, [3,4], becomes the second row in the constructed 2D array.

Example 2:
Input: original = [1,2,3], m = 1, n = 3
Output: [[1,2,3]]
Explanation: The constructed 2D array should contain 1 row and 3 columns.
Put all three elements in original into the first row of the constructed 2D array.

Example 3:
Input: original = [1,2], m = 1, n = 1
Output: []
Explanation: There are 2 elements in original.
It is impossible to fit 2 elements in a 1x1 2D array, so return an empty 2D array.

 Constraints:
--> 1 &lt;= original.length &lt;= 5 * 104
--> 1 &lt;= original[i] &lt;= 105
--> 1 &lt;= m, n &lt;= 4 * 104

*/

import java.util.*;

public class tech26 {

    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][n];
        int index = 0;

        if (original.length != m * n) {
            System.out.print("Invalid matrix size for the given elemtens ");
            System.exit(0);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[index++];
            }
        }
        return result;
    }

    public static void print2DArray(int[][] arr) {
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
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
        System.out.print("Enter the rows : ");
        int m = sc.nextInt();

        System.out.print("Enter the coloumns : ");
        int n = sc.nextInt();

        int[][] result1 = construct2DArray(arr, m, n);
        print2DArray(result1);
        sc.close();
    }
}
