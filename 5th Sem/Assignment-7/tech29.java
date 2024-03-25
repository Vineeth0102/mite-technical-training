/*

 Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.
Example 2:

Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated 
into ascending order.

Your Task:
You don't need to read input or print anything. Your task is to complete the function sort012() that takes an array arr and N as input parameters and sorts the array in-place.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

 */

import java.util.Scanner;

public class tech29 {
    public static void sort012(int arr[],int num){
        int low = 0,mid =0,high=num-1,temp;
        while(mid<=high){
            if ((arr[mid]) == 0) {
                temp = arr[mid];
                arr[mid++]=arr[low];
                arr[low++] = temp;
            }
            else if ((arr[mid]) == 1) {
                mid++;
            }
            else{
                temp = arr[mid];
                arr[mid]=arr[high];
                arr[high--] = temp;
            }
        }
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
        sort012(arr,size);
        System.out.print("Array after sorting : ");
        for(int i=0 ; i<size ; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}