/*

Given a string S. The task is to print all unique permutations of the given string that may contain dulplicates in lexicographically sorted order. 

Example 1:

Input: ABC
Output:
ABC ACB BAC BCA CAB CBA
Explanation:
Given string ABC has permutations in 6 
forms as ABC, ACB, BAC, BCA, CAB and CBA .
Example 2:

Input: ABSG
Output:
ABGS ABSG AGBS AGSB ASBG ASGB BAGS 
BASG BGAS BGSA BSAG BSGA GABS GASB 
GBAS GBSA GSAB GSBA SABG SAGB SBAG 
SBGA SGAB SGBA
Explanation:
Given string ABSG has 24 permutations.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function find_permutation() which takes the string S as input parameter and returns a vector of string in lexicographical order.

Expected Time Complexity: O(n! * n)
Expected Space Complexity: O(n! * n)

Constraints:
1 <= length of string <= 5

*/

import java.util.*;

class Solution {
    public List<String> find_permutation(String S) {
        Set<String> uniquePermutations = new TreeSet<>();
        char[] chars = S.toCharArray();
        generatePermutations(chars, 0, uniquePermutations);
        return new ArrayList<>(uniquePermutations);
    }
    
    private void generatePermutations(char[] chars, int start, Set<String> uniquePermutations) {
        if (start == chars.length) {
            uniquePermutations.add(new String(chars));
            return;
        }
        
        for (int i = start; i < chars.length; i++) {
            if (i != start && chars[i] == chars[start]) {
                continue;
            }
            swap(chars, start, i);
            generatePermutations(chars, start + 1, uniquePermutations);
            swap(chars, start, i);
        }
    }
    
    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}

public class tech38 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String  : ");
        String str = sc.nextLine();
        List<String> res = solution.find_permutation(str);
        System.out.println("Permutations of " + str + ": " + res);
        sc.close();
    }
}
