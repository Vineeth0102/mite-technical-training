""" 
Reverse a given number without using string function.

E.g input: 6752
Output:2576
"""

num = int(input("Enter the number : "))
res = 0 
while(num > 0):
    res = res *10 + num % 10
    num = num//10
print(res)