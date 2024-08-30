"""
You're given a string where multiple
characters are repeated consecutively. You're supposed to reduce the size of
this string using mathematical logic given as in the example below :
•Input =   
abbbccddddde
•Output = ab3c2d5e
What is the time complexity of your
code?
"""

String = input("Enter the String : ")
stack = []
count,res = 0,String[0]
for i in String:
    if stack and stack[-1] == i :
        count+=1
    elif not stack:
        stack.append(i)
    else :
        stack.append(i)
        count+=1
        if count == 1 :
            res = res + i 
        else :
            res = res + str(count) + i 
        count = 0
if count == 0 :
    print(res)
else :
    print(res + str(count+1))