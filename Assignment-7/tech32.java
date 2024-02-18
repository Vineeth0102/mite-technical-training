/*

Given two arrays a[] and b[] of size n and m respectively. The task is to find the number of elements in the union between these two arrays.

The Union of the two arrays can be defined as the set containing distinct elements from both arrays. If there are repetitions, then only one occurrence of an element should be printed in the union.

Note : Elements are not necessarily distinct.

Example 1:

Input:
5 3
1 2 3 4 5
1 2 3
Output: 
5
Explanation: 
1, 2, 3, 4 and 5 are the
elements which comes in the union set
of both arrays. So count is 5.
Example 2:

Input:
6 2 
85 25 1 32 54 6
85 2 
Output: 
7
Explanation: 
85, 25, 1, 32, 54, 6, and
2 are the elements which comes in the
union set of both arrays. So count is 7.
Your Task:
Complete the doUnion function that takes a, n, b, m as parameters and returns the count of union elements of the two arrays. The printing is done by the driver code.

Constraints:
1 ≤ n, m ≤ 105
0 ≤ a[i], b[i] < 105

Expected Time Complexity: O(n+m)
Expected Auxilliary Space: O(n+m)

Note: Companies :
Zoho, Rockstand 

*/
import java.util.HashMap;
import java.util.Scanner;

public class tech32 {
    public static int unionArrays(int arr1[],int[] arr2){
        HashMap<Integer, Integer> intCountMap = new HashMap<Integer, Integer>();
        for(int i = 0 ; i<arr1.length;i++){
            if (intCountMap.containsKey(arr1[i])) {
                intCountMap.put(arr1[i], intCountMap.get(arr1[i]) + 1);
            }
            else {
                intCountMap.put(arr1[i], 1);
            }
        }
        for(int i = 0 ; i<arr2.length;i++){
            if (intCountMap.containsKey(arr2[i])) {
                intCountMap.put(arr2[i], intCountMap.get(arr2[i]) + 1);
            }
            else {
                intCountMap.put(arr2[i], 1);
            }
        }
        return intCountMap.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sizes of the arrays : ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        size = sc.nextInt();
        int[] arr2 = new int[size];
        System.out.print("Enter the elemnts of First array : ");
        for(int i=0 ; i<arr1.length ; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the elemnts of Second array : ");
        for(int i=0 ; i<arr2.length ; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.print("Elements in the Unon of the array is : "+ unionArrays(arr1,arr2));
        sc.close();
    }
}