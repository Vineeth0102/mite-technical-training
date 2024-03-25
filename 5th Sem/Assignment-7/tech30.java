/*
 
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
Example 1:
Input:
N = 5
A[] = {1,2,3,5}
Output: 4


Example 2:
Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9

Your Task :
You don't need to read input or print anything. Complete the function MissingNumber() that takes array and N as input  parameters and returns the value of the missing number.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 106
1 ≤ A[i] ≤ 106

NOTE: Companies 
AMAZON, FLIPKART,ADOBE, CISCO, OLA CABS 

 */
import java.util.Scanner;

public class tech30 {
    public static int MissingNumber(int arr[],int num){
        int[] temp = new int[num+1];
        for(int i = 0 ; i<temp.length;i++){
            temp[i] = 0;
        }
        for(int i = 0 ; i<arr.length;i++){
            temp[arr[i]] = 1;
        }
        for(int i = 1 ; i<temp.length;i++){
            if (temp[i] != 1 )
            return i ;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elemnts : ");
        for(int i=0 ; i<size-1 ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Missing element in the array is : "+ MissingNumber(arr,size));
        sc.close();
    }
}