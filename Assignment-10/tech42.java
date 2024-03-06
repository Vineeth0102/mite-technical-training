/*

Find common elements in three sorted arrays

Explanation: take 3 sorted arrays as an input 
print all common elements in these 3 arrays, Irrespective of there index numbers.
Examples: 
Input: 
ar1[] = {1, 5, 10, 20, 40, 80} 
ar2[] = {6, 7, 20, 80, 100} 
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} 
Output: 20, 80
Input: 
ar1[] = {1, 5, 5} 
ar2[] = {3, 4, 5, 5, 10} 
ar3[] = {5, 5, 10, 20} 
Output: 5, 5
Max Time_Complexity : O(n1 + n2 + n3)
Max_Space Complexity:O(max(n1,n2,n3))

*/

import java.util.*;

class Solution {
    public List<Integer> findCommonElements(int[] ar1, int[] ar2, int[] ar3) {
        List<Integer> commonElements = new ArrayList<>();
         int i = 0, j = 0, k = 0;
        while (i < ar1.length && j < ar2.length && k < ar3.length) {
            if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                commonElements.add(ar1[i]);
                i++;
                j++;
                k++;
            } 
            else if (ar1[i] < ar2[j]) {
                i++;
            } 
            else if (ar2[j] < ar3[k]) {
                j++;
            } 
            else {
                k++;
            }
        }   
        return commonElements;
    }
}

public class tech42 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first array : ");
        int num = sc.nextInt();
        int arr1[] = new int[num];
        System.out.print("Enter the elements of the array : ");
        for(int i = 0 ; i< num;i++ ){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the second array : ");
        num = sc.nextInt();
        int arr2[] = new int[num];
        System.out.print("Enter the elements of the array : ");
        for(int i = 0 ; i< num;i++ ){
            arr2[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the third array : ");
        num = sc.nextInt();
        int arr3[] = new int[num];
        System.out.print("Enter the elements of the array : ");
        for(int i = 0 ; i< num;i++ ){
            arr3[i] = sc.nextInt();
        }
        List<Integer> res = solution.findCommonElements(arr1, arr2, arr3);
        System.out.println("Common elements: " + res);
        sc.close();
    }
}
