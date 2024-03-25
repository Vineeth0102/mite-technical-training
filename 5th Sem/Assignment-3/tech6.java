/* 
Given one integer n and return true if it is an even number else return false.

Even(6) -> True.
Even(7) -> False.
Even(9) -> False. 

*/

import java.util.*;

public class tech6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(num%2==0);
        sc.close();
    }
}