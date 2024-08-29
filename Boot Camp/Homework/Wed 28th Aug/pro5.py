"""The Valid Parentheses Problem
● Problem: Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if
the input string is valid. An input string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
● Example: Input: "()", Output: True; Input: "([)]", Output: False
● Hint: Use a stack to track the opening brackets."""




s = input("Enter the Parentheses : ")
val = [1]


for i in s :
    if i =='(' or i == '{' or i == '[' : val.append(i)
    elif i == ')' and val[-1] == '(':val.pop(-1)
    elif i == '}' and val[-1] == '{':val.pop(-1)
    elif i == ']' and val[-1] == '[':val.pop(-1)
    else :
        print("Invalid")
        exit(0)
if len(val)!= 1 :
    print("Invalid")
    exit(0)


print("Valid")
