/*

Zero Converter:
You are given a number n. The number n can be negative or positive. If n is negative, print numbers from n to 0 by adding 1 to n in the neg function. If positive, print numbers from n-1 to 0 by subtracting 1 from n in the pos function.

Note:- You don't have to return anything, you just have to print the array.

Example 1:
Input:
n = 0
Output:
already Zero
 
Example 2:
Input:
n = 4
Output:
3 2 1 0
 
Example 3:
Input:
n = -3
Output:
-3 -2 -1 0
 
Your Task:
This is a function problem. You need to take input of test cases. Just complete the functions pos() and neg().

Constraints:
-10^3 <= x <= 10^3

 */

import java.util.*;

public class tech10 {

    public static void pos(int num){
        while(num != 0){
            System.out.print(num-1+" ");
            num--;
        }
    }

    public static void neg(int num){
        while(num != 1){
            System.out.print(num+" ");
            num++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if(num == 0 ){
            System.out.println("already Zero ");
        }
        else if (num < 0){
            neg(num);
        }
        else{
            pos(num);
        }
        sc.close();
    }
}