/*

Given a string S consisting of lowercase Latin Letters. Return the first non-repeating character in S. If there is no non-repeating character, return '$'.

Example 1:

Input:
S = hello
Output: h
Explanation: In the given string, the
first character which is non-repeating
is h, as it appears first and there is
no other 'h' in the string.
Example 2:

Input:
S = zxvczbtxyzvy
Output: c
Explanation: In the given string, 'c' is
the character which is non-repeating. 
Your Task:
You only need to complete the function nonrepeatingCharacter() that takes string S as a parameter and returns the character. If there is no non-repeating character then return '$' .

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).
Note: N = |S|

Constraints:
1 <= N <= 105

*/

import java.util.*;

class Solution {
    public char nonrepeatingCharacter(String S) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : S.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        for (char ch : S.toCharArray()) {
            if (frequencyMap.get(ch) == 1) {
                return ch;
            }
        }
        return '$';
    }
}

public class tech39 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String  : ");
        String str = sc.nextLine();
        System.out.println("First non-repeating character in \"" + str + "\": " + solution.nonrepeatingCharacter(str));
        sc.close();
    }
}
