/*

1)Program to cyclically rotate an array by one

Explanation: You have to take 2 inputs from the users 
The first input is for your array elements
The second input is for the number of rotation  

Input: arr[] = {1, 2, 3, 4, 5}
Number Of Rotation: 1
Output: arr[] = {5, 1, 2, 3, 4}

Input: arr[] = {2, 3, 4, 5, 1}
Number Of Rotation: 2
Output: {1,5, 2, 3, 4}

Max Time_Complexity : Time Complexity: O(n)
Max_Space Complexity : O(1)

*/

import java.util.*;

class Solution {
    public int[] shiftArr(int[] arr, int n, int shift) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[(shift+i)%n] = arr[i];
        }
        return result;
    }
}


public class tech41 {
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
        System.out.print("Enter the shift : ");
        int shift = sc.nextInt();

        int [] res =  solution.shiftArr(arr,num,shift);
        System.out.print("Elements after shift : ");
        for(int i =0 ; i<res.length ; i++){
            System.out.print(res[i]+" ");
        }
        sc.close();
    }
}
