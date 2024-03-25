/*

    A celebrity is a person who is known to all but does not know anyone at a party. If you go to a party of N people, find if there is a celebrity in the party or not.
A square NxN matrix M[][] is used to represent people at the party such that if an element of row i and column j  is set to 1 it means ith person knows jth person. Here M[i][i] will always be 0.
Return the index of the celebrity, if there is no celebrity return -1.
Note: Follow 0-based indexing.
Follow Up: Can you optimize it to O(N)
 
Example 1:
Input:
N = 3
M[][] = {{0 1 0},
         {0 0 0}, 
         {0 1 0}}
Output: 1
Explanation: 0th and 2nd person both
know 1. Therefore, 1 is the celebrity.

Example 2:
Input:
N = 2
M[][] = {{0 1},
         {1 0}}
Output: -1
Explanation: The two people at the party both
know each other. None of them is a celebrity.

Your Task:
You don't need to read input or print anything. Complete the function celebrity() which takes the matrix M and its size N as input parameters and returns the index of the celebrity. If no such celebrity is present, return -1.

Expected Time Complexity: O(N^2)
Expected Auxiliary Space: O(1)

Constraints:
2 <= N <= 3000
0 <= M[][] <= 1

*/

import java.util.Scanner;

public class tech44 {
    public static int celebrity(int[][] arr, int size) {
        int left = 0;
        int right = size - 1;
        while (left < right) {
            if (arr[left][right] == 1) {
                left++;
            } else {
                right--;
            }
        }
        int potentialCelebrity = right;
        for (int i = 0; i < size; i++) {
            if (i != potentialCelebrity) {
                if (arr[i][potentialCelebrity] == 0 || arr[potentialCelebrity][i] == 1) {
                    return -1;
                }
            }
        }
        return potentialCelebrity;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the matrix : ");
        int size = sc.nextInt();
        int arr[][] = new int[size][size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(celebrity(arr, size));
        sc.close();
    }
}
