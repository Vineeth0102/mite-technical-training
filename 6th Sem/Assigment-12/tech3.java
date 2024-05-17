/*

Write a program to print a string that contains the maximum number of special characters from the given array of
strings.
Input [abc@123, @a#, abc]
Output a@#

*/

import java.util.*;
public class tech3 {
    public static void main(String[] args) {
        String res="";
        int ref = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int size = sc.nextInt();
        String arr[] = new String[size+1];
        System.out.print("Enter the strings : ");
        for (int i = 0; i < size+1; i++) {
            arr[i] = sc.nextLine();
        }
        for (int i = 0; i < size+1; i++) {
            if (ref < countSpecial(arr[i])){
                res = arr[i];
            }
        }
        System.out.print("String with a maximum Special charater : "+res);
        sc.close();
    }

    public static int countSpecial(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(Character.isLetter(ch) || Character.isDigit(ch)|| Character.isWhitespace(ch))){
                count++;
            }
        }
        return count;
    }
    
}
