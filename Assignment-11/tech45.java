/*

Write a program to Validate an IPv4 Address.
According to Wikipedia, IPv4 addresses are canonically represented in dot-decimal notation, which consists of four decimal numbers, each ranging from 0 to 255, separated by dots, e.g., 172.16.254.1 .
A valid IPv4 Address is of the form x1.x2.x3.x4 where 0 <= (x1, x2, x3, x4) <= 255.
Thus, we can write the generalized form of an IPv4 address as (0-255).(0-255).(0-255).(0-255).
Note: Here we are considering numbers only from 0 to 255 and any additional leading zeroes will be considered invalid.

Your task is to complete the function isValid which returns 1 if the given IPv4 address is valid else returns 0. The function takes the IPv4 address as the only argument in the form of a string.

Example 1:

Input:
IPv4 address = 222.111.111.111
Output: 1
Explanation: Here, the IPv4 address is as
per the criteria mentioned and also all
four decimal numbers lie in the mentioned
range.

Example 2:

Input:
IPv4 address = 5555..555
Output: 0
Explanation: 5555..555 is not a valid
IPv4 address, as the middle two portions
are missing.

Your Task:
Complete the function isValid() which takes the address in the form of string s as an input parameter and returns 1 if this is a valid address otherwise returns 0.

Expected Time Complexity: O(N), N = length of the string.
Expected Auxiliary Space: O(1)

Constraints:
1<=length of string <=50

Note: The Input/Output format and Example given are used for the system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.

*/

import java.util.Scanner;

public class tech45 {
    public static int isValid(String s) {
        String[] parts = s.split("\\.");
        if (parts.length != 4)
            return 0;
        for (String part : parts) {
            if (part.isEmpty() || !part.matches("\\d+"))
                return 0;
            if (part.charAt(0) == '0' && part.length() > 1)
                return 0;
            int num = Integer.parseInt(part);
            if (num < 0 || num > 255)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the IP address : ");
        String ipv  = sc.nextLine();
        System.out.println(isValid(ipv));
        sc.close();
    }
}
