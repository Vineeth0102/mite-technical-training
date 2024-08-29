"""
Prime Numbers - 
 a. Printing n Prime numbers
 b. Printing nth Prime number
 c. Given a number , printing next Prime number
"""

import math

num = int(input("Enter the Number : "))
counter,val,res = 0, 2,0
if num == 1:
    print(2)
while(counter < num):
    flag = 0
    for i in range(2,(math.ceil(val**0.5))+1): #
        if val % i == 0 : 
            flag = 1
            break
    if flag == 0:
        res = val
        counter +=1
    val +=1 
print(res)