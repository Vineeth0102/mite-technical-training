/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 
Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

 
Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define MAX_SIZE 10000

struct Stack {
    char* arr;
    int top;
};

struct Stack* initializeStack() {
    struct Stack* stack = (struct Stack*)malloc(sizeof(struct Stack));
    stack->arr = (char*)malloc(MAX_SIZE * sizeof(char));
    stack->top = -1;
    return stack;
}

void push(struct Stack* stack, char ch) {
    stack->arr[++stack->top] = ch;
}

char pop(struct Stack* stack) {
    if (stack->top == -1)
        return '\0';
    return stack->arr[stack->top--];
}

bool isOpeningBracket(char ch) {
    return (ch == '(' || ch == '[' || ch == '{');
}

bool isClosingBracket(char ch) {
    return (ch == ')' || ch == ']' || ch == '}');
}

bool isValid(char* s) {
    struct Stack* stack = initializeStack();

    for (int i = 0; s[i] != '\0'; i++) {
        if (isOpeningBracket(s[i])) {
            push(stack, s[i]);
        } else if (isClosingBracket(s[i])) {
            char topChar = pop(stack);
            if ((topChar == '(' && s[i] != ')') ||
                (topChar == '[' && s[i] != ']') ||
                (topChar == '{' && s[i] != '}')) {
                free(stack->arr);
                free(stack);
                return false;
            }
        }
    }

    if (stack->top != -1) {
        free(stack->arr);
        free(stack);
        return false;
    }

    free(stack->arr);
    free(stack);
    return true;
}

int main() {
    char s[MAX_SIZE];
    printf("Enter a string containing only parentheses, brackets, and curly braces: ");
    fgets(s, MAX_SIZE, stdin);

    if ((strlen(s) > 0) && (s[strlen(s) - 1] == '\n'))
        s[strlen(s) - 1] = '\0';

    printf("%s\n", isValid(s) ? "true" : "false");

    return 0;
}
