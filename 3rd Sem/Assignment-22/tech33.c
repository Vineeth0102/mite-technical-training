/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal 
substring
 consisting of non-space characters only.
 
Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.

 
Constraints:
1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
*/

#include <stdio.h>
#include <stdbool.h>
#include <string.h>

int lengthOfLastWord(char* s) {
    int length = 0;
    int i = strlen(s) - 1;
    bool isWord = false;

    while (i >= 0) {
        if (s[i] != ' ') {
            isWord = true;
            length++;
        } else if (isWord) {
            break;
        }
        i--;
    }

    return length;
}

int main() {
    char s[10000];
    printf("Enter a string: ");
    fgets(s, sizeof(s), stdin);

    if ((strlen(s) > 0) && (s[strlen(s) - 1] == '\n'))
        s[strlen(s) - 1] = '\0';

    printf("Output: %d\n", lengthOfLastWord(s));

    return 0;
}
