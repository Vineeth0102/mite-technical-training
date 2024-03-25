/*

Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears strictly more than N/2 times in the array.

Example 1:

Input:
N = 3 
A[] = {1,2,3} 
Output:
-1
Explanation:
Since, each element in 
{1,2,3} appears only once so there 
is no majority element.
Example 2:

Input:
N = 5 
A[] = {3,1,3,3,2} 
Output:
3
Explanation:
Since, 3 is present more
than N/2 times, so it is 
the majority element.

Your Task:
The task is to complete the function majorityElement() which returns the majority element in the array. If no majority exists, return -1.
 
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
 
Constraints:
1 ≤ N ≤ 107
0 ≤ Ai ≤ 106

NOTE: COMPANIES : 
Flipkart, Accorlite, Amazon, Microsoft, D-E-Shaw, Google, Nagarro, Atlassian 

*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class tech31 {
    public static int majorityElement(int arr[],int num){
        HashMap<Integer, Integer> intCountMap = new HashMap<Integer, Integer>();
        for(int i = 0 ; i<arr.length;i++){
            if (intCountMap.containsKey(arr[i])) {
                intCountMap.put(arr[i], intCountMap.get(arr[i]) + 1);
            }
            else {
                intCountMap.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : intCountMap.entrySet()) {
            if (entry.getValue() > arr.length / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elemnts : ");
        for(int i=0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Majority element in the array is : "+ majorityElement(arr,size));
        sc.close();
    }
}